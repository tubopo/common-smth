plugins {
  id("org.smth.release-conventions")
}

scmVersion {
  monorepo {
    include(
      listOf(
        "common-smth/module-smth-api",
        "common-smth/module-smth-a",
        "common-smth/module-smth-b"
      )
    )
  }
}
