plugins {
  id("org.smth.java-conventions")
  id("ogr.smth.analyze-conventions")
  id("org.smth.release-conventions")
}

scmVersion {
  monorepo {
    include(
      listOf(
        "module-smth-api",
        "module-smth-a",
        "module-smth-b"
      )
    )
  }
}
