description = "module-smth-b"

plugins {
  id("ogr.smth.analyze-conventions")
  id("org.smth.release-conventions")
}

dependencies {
  //  api("org.smth:module-smth-api:0.1.0")
  api(project(":module-smth-api"))
}
