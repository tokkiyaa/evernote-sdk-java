package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.oauth._
import com.evernote.thrift.protocol.TBinaryProtocol
import com.evernote.thrift.transport.THttpClient
import com.evernote.edam.userstore._
import com.evernote.edam.notestore._
import com.typesafe.config.ConfigFactory

import scala.collection.JavaConverters._

class Evernote @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  private[this] val config = ConfigFactory.load

  private[this] val key = ConsumerKey(config.getString("evernote.consumerKey.key"), config.getString("evernote.consumerKey.secret"))
  private[this] val evernote = OAuth(ServiceInfo(
    config.getString("evernote.requestTokenURL"),
    config.getString("evernote.accessTokenURL"),
    config.getString("evernote.authorizationURL"), key),
    false)
  private[this] val callbackUrl = config.getString("evernote.callbackUrl")
  private[this] val userStoreUrl = config.getString("evernote.userStoreUrl")


  def authenticate = Action { request =>
    request.queryString.get("oauth_verifier").flatMap(_.headOption).map { verifier =>
      val tokenPair = sessionTokenPair(request).get
      // We got the verifier; now get the access token, store it and back to index
      evernote.retrieveAccessToken(tokenPair, verifier) match {
        case Right(t) => {
          val userStoreTrans: THttpClient = new THttpClient(userStoreUrl)
          val userStoreProt: TBinaryProtocol = new TBinaryProtocol(userStoreTrans)
          val userStore: UserStore.Client = new UserStore.Client(userStoreProt, userStoreProt)
          val noteStoreUrl: String = userStore.getNoteStoreUrl(t.token)
          val noteStoreTrans: THttpClient = new THttpClient(noteStoreUrl)
          val noteStoreProt: TBinaryProtocol = new TBinaryProtocol(noteStoreTrans)
          val noteStore: NoteStore.Client = new NoteStore.Client(noteStoreProt, noteStoreProt)
          val notebooks: String = noteStore.listNotebooks(t.token).asScala.map(_.getName).mkString(",")

          // We received the authorized tokens in the OAuth object - store it before we proceed
          Redirect(routes.Application.index).withSession(
            "token" -> t.token,
            "secret" -> t.secret,
            "noteStoreUrl" -> noteStoreUrl,
            "notebooks" -> notebooks
          )
        }
        case Left(e) => throw e
      }
    }.getOrElse(
      evernote.retrieveRequestToken(callbackUrl) match {
        case Right(t) => {
          // We received the unauthorized tokens in the OAuth object - store it before we proceed
          Redirect(evernote.redirectUrl(t.token)).withSession("token" -> t.token, "secret" -> t.secret)
        }
        case Left(e) => throw e
      })
  }

  private[controllers] def sessionTokenPair(implicit request: RequestHeader): Option[RequestToken] = {
    for {
      token <- request.session.get("token")
      secret <- request.session.get("secret")
    } yield {
      RequestToken(token, secret)
    }
  }
}
