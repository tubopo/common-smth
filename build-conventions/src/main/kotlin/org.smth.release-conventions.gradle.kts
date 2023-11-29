import org.jetbrains.changelog.date

plugins {
    id("org.smth.java-conventions")
    id("maven-publish")
    id("pl.allegro.tech.build.axion-release")
    id("org.jetbrains.changelog")
}

scmVersion {
    repository {
        type.set("git")
    }

    tag {
        prefix.set("v")
    }

    checks {
        // seeks staged, but uncommitted changes in repository
        uncommittedChanges.set(true)

        // all local commits have been pushed to remote
        aheadOfRemote.set(true)

        // build has no snapshot libraries in dependencies
        snapshotDependencies.set(true)
    }

}

// release version
project.version = scmVersion.version

//this task used in CI/CD to determine project version
tasks.register("getProjectVersion") {
    println(version)
}

// Application publishing
publishing {
    repositories {
        maven {
            name = "GithubPackages"
            url = uri("")
            credentials {
                username =
                    project.properties["github.username"] as String? ?: System.getenv("GITHUB_USERNAME") ?: ""
                password =
                    project.properties["github.token"] as String? ?: System.getenv("GITHUB_TOKEN") ?: ""
            }
        }
    }
}

changelog {
    path.set(file("CHANGELOG.md").canonicalPath)
    header.set(provider { "[${version.get()}] - ${date()}" })
    lineSeparator.set("\n")
}
