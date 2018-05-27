name := "EvernoteScalaSample"
organization := "com.evernote"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  guice,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % "test",
  "com.evernote" % "evernote-api" % "1.25.1",
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
)