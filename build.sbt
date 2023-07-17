ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

crossTarget := baseDirectory.value / "target"

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  "mybuild.jar"
}

lazy val root = (project in file("."))
  .settings(
    name := "sample",
    idePackagePrefix := Some("com.mintmee.sample"),
    ThisBuild / crossPaths := false
  )


