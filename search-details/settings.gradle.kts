apply(from = "../gradle/settings/build-logic-settings.gradle.kts")
apply(from = "../gradle/settings/version-catalog-settings.gradle.kts")

includeBuild("../network")
includeBuild("../common")

rootProject.name = "search-details"

include(":search-details-presentation")
include(":repository:search-details-repository-contract")
include(":repository:search-details-repository-provider")
include(":search-details-mapper")
include(":search-details-models")
include(":search-details-integration-test")