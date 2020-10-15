name := "sbt_test"

version := "1.0"

scalaVersion := "2.11.12"

mainClass := Some("Hi")

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.4"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4"
libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.12"


