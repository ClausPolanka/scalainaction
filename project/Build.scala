import sbt._
import sbt.Keys._
import com.typesafe.sbtscalariform.ScalariformPlugin._

object Build extends Build {

  lazy val root = Project(
    "scalainaction",
    file("."),
    settings = commonSettings ++ Seq(
      libraryDependencies ++= Seq(
      )
    )
  )

  def commonSettings = 
    Defaults.defaultSettings ++ 
    scalariformSettings ++
    Seq(
      organization := "name.heikoseeberger",
      scalaVersion := "2.10.0-M7",
      scalacOptions ++= Seq("-unchecked", "-deprecation"),
      libraryDependencies ++= Seq(
        Dependencies.Test.ScalaTest,
        Dependencies.Test.ScalaCheck
      ),
      initialCommands in console := "import name.heikoseeberger.scalainaction._"
    )

  object Dependencies {

    object Compile {
      val Config = "com.typesafe" % "config" % "0.5.2"
    }

    object Test {
      val ScalaTest = "org.scalatest" %% "scalatest" % "2.0.M4-2.10.0-M7-B1" % "test" cross CrossVersion.full
      val ScalaCheck = "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" cross CrossVersion.full
    }
  }
}
