description = "module-smth-api"

plugins {
  id("ogr.smth.analyze-conventions")
  id("org.smth.release-conventions")
}

scmVersion {
  tag {
    prefix.set(description)
  }
}
