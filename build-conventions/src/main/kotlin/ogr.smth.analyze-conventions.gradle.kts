plugins {
  id("org.smth.java-conventions")
  id("checkstyle")
  id("jacoco")
  id("jacoco-report-aggregation")
  id("org.sonarqube")
}

jacoco {
  toolVersion = "0.8.8"
}

tasks.jacocoTestReport {
  reports.xml.required.set(true)
}

val exclusionSonarCheckingClasses = listOf(
  "**/dto/**",
  "**/props/**",
  "**/utils/**",
  "**/exception/**"
)

sonarqube {
  properties {
    property("sonar.coverage.exclusions", exclusionSonarCheckingClasses)
  }
}

checkstyle {
  toolVersion = "10.4"
  maxWarnings = 0
  isShowViolations = true
  val archive = configurations.checkstyle.get().resolve().filter {
    it.name.startsWith("checkstyle")
  }
  config = resources.text.fromArchiveEntry(archive, "google_checks.xml")


}

tasks.test {
  finalizedBy("jacocoTestReport")
}
