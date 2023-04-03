apply(from = "../gradle/settings/build-logic-settings.gradle.kts")
apply(from = "../gradle/settings/version-catalog-settings.gradle.kts")

includeBuild("../network")
includeBuild("../common")

rootProject.name = "search"

include(":search-presentation")
include(":repository:search-repository-contract")
include(":repository:search-repository-provider")
include(":search-pager")
include(":search-models")
include(":search-mapper")
include(":search-integration-test")