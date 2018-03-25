name := "kafka-ksql-esp"

version := "0.1-SNAPSHOT"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.4",

  libraryDependencies ++= Seq(
    "org.scalatest"  %% "scalatest" 		% "3.0.5" 	% "test",
    "ch.qos.logback"  % "logback-classic" 	% "1.2.3"
  )
)

lazy val kafkaBroker = (project in file("kafka-broker")).settings(commonSettings: _*)

resolvers += "SBT Releases" at "https://dl.bintray.com/sbt/sbt-plugin-releases/"