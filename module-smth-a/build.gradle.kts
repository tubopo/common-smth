description = "module-smth-a"

plugins {
  id("ogr.smth.analyze-conventions")
  id("org.smth.release-conventions")
}

scmVersion {
  tag {
    prefix.set(description)
    versionSeparator.set("@")
  }
}

dependencies {
  api(project(":module-smth-api"))
}
