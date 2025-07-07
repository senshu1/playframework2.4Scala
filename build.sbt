name := "play-2.4-app"
version := "1.0"
scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
