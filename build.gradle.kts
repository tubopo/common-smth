plugins {
    id("org.smth.release-conventions")
}

scmVersion {
    monorepo {
        include(
            listOf(
                "module-smth-a",
                "module-smth-b",
                "module-smth-c"
            )
        )
    }
}
