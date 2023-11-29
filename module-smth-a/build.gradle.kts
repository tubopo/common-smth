description = "module-smth-a"

plugins {
  id("ogr.smth.analyze-conventions")
  id("org.smth.release-conventions")
}

dependencies {
  api(project(":module-smth-api"))
}
