dependencyResolutionManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
  }

  versionCatalogs {
    create("libs") {
      from(files("../gradle/libs.versions.toml"))
    }
  }
}

rootProject.name = "build-conventions"
