apply(from = "../gradle/settings/build-logic-settings.gradle.kts")
apply(from = "../gradle/settings/version-catalog-settings.gradle.kts")

includeBuild("../network")

rootProject.name = "common"

include(":coroutines-annotation")
include(":coroutines-provider")
include(":test-framework")
include(":compose-test-contract")
