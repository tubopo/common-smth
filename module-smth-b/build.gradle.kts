description = "module-smth-b"

plugins {
  id("ogr.smth.analyze-conventions")
  id("org.smth.release-conventions")
}

scmVersion {
  tag {
    prefix.set(description)
  }
}

dependencies {
  api(project(":module-smth-api"))
}
