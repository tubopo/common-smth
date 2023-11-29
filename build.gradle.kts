plugins {
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
