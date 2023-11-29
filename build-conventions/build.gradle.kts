plugins {
  alias(libs.plugins.kotlin.dsl)
}

dependencies {
  implementation(libs.axion.release)
  implementation(libs.jetbrains.changelog)
  implementation(libs.checkstyle)
  implementation(libs.sonarqube)
  implementation(libs.lombok)
}
