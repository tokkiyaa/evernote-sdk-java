package controllers

import javax.inject._
import play.api.mvc.{Action, _}
import views.html

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Home page
    */
  def index = Action { implicit request =>
    Ok(html.index()) // todo: .withSession
  }

  /**
    * Clear session
    */
  def clear = Action { implicit request =>
    Ok(html.index()).withNewSession
  }

}
