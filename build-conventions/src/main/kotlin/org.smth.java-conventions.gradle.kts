group = "org.smth"

repositories {
  mavenLocal()
  mavenCentral()
  maven(url = "https://packages.confluent.io/maven/")
  maven {
    url = uri("https://maven.pkg.github.com/tubopo/${rootProject.name}")
    credentials {
      username =
        project.properties["github.username"] as String? ?: System.getenv("GITHUB_USERNAME") ?: ""
      password =
        project.properties["github.username"] as String? ?: System.getenv("GITHUB_USERNAME") ?: ""
    }
  }
}

plugins {
  id("io.freefair.lombok")
  id("java")
  id("java-library")
}

java {
  withSourcesJar()
  withJavadocJar()
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

tasks.javadoc {
  options.encoding = "UTF-8"
  if (JavaVersion.current().isJava9Compatible) {
    (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
  }
}

tasks.jar {
  enabled = true
  archiveClassifier.set("")
  manifest {
    attributes(
      mapOf(
        "Implementation-Title" to project.name,
        "Implementation-Version" to project.version
      )
    )
  }
}

tasks.test {
  systemProperty("file.encoding", "UTF-8")
  useJUnitPlatform()
}

tasks.compileJava {
  options.encoding = "UTF-8"
  options.compilerArgs = listOf("-Xlint:deprecation")
}

