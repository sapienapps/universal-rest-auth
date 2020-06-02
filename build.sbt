name := "universal-rest"
version := "0.4.1"
scalaVersion := "2.12.11"

organization := "com.sapienapps"
githubOwner := "sapienapps"
githubRepository := "universal-rest"

val Http4sVersion  = "0.21.4"
val CirceVersion   = "0.13.0"
val TsecVersion = "0.2.0-M1"

libraryDependencies ++= Seq(
  // Authentication dependencies
  "io.github.jmcardon" %% "tsec-common" % TsecVersion,
  "io.github.jmcardon" %% "tsec-password" % TsecVersion,
  "io.github.jmcardon" %% "tsec-mac" % TsecVersion,
  "io.github.jmcardon" %% "tsec-signatures" % TsecVersion,
  "io.github.jmcardon" %% "tsec-jwt-mac" % TsecVersion,
  "io.github.jmcardon" %% "tsec-jwt-sig" % TsecVersion,
  "io.github.jmcardon" %% "tsec-http4s" % TsecVersion,
  //
  "com.sapienapps" %% "universal-rest" % "0.4.1"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-language:higherKinds",
  "-language:postfixOps",
  "-feature",
  "-Ypartial-unification",
  "-Xfatal-warnings"
)
