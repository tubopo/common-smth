rootProject.name = "common-smth"

includeBuild("build-conventions")

include(
  ":module-smth-api",
  ":module-smth-a",
  ":module-smth-b"
)

