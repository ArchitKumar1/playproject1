name := """archit"""
organization := "grofers"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayBean)

scalaVersion := "2.13.1"

libraryDependencies += guice




libraryDependencies ++= Seq(
  javaJdbc,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.41",
  "com.squareup.retrofit" % "retrofit" % "1.9.0",
  "com.squareup.okhttp3" % "okhttp" % "3.2.0",
  "org.json" % "json" % "20090211",
  "com.amazonaws" % "aws-java-sdk-sqs" % "1.11.1",
  "javax.mail" % "mail" % "1.4",
  "com.opencsv" % "opencsv" % "3.3",
  "org.ocpsoft.prettytime" % "prettytime" % "3.2.7.Final",
  "org.projectlombok" % "lombok" % "1.16.12",
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.mockito" % "mockito-all" % "1.10.19",
  "org.modelmapper" % "modelmapper" % "0.7.7",
  "com.google.inject.extensions" % "guice-multibindings" % "4.0",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % "2.0.4",

 // "io.swagger" %% "swagger-play2" % "1.5.3",



)