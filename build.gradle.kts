plugins {
  id("org.smth.release-conventions")
}

scmVersion {
  monorepo {
    include(
      listOf(
        "${rootProject.name}/module-smth-api",
        "${rootProject.name}/module-smth-a",
        "${rootProject.name}/module-smth-b"
      )
    )
    exclude(
      listOf(
        rootProject.name,
        "${rootProject.name}/build-conventions"
      )
    )
  }
}
