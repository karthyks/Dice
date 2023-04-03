import com.karthyks.plugin.Projects

plugins {
    id("android-lib-plugin")
    id("hilt-dagger")
}

group = "${group}.search-details"

android {
    namespace = "com.karthyks.dice.searchdetails"
}

dependencies {
    implementation(libs.activity.compose)
    implementation(libs.navigation.compose)

    implementation(libs.paging)
    implementation(libs.pagingCompose)

    implementation(project(":repository:search-details-repository-contract"))
    implementation(project(":repository:search-details-repository-provider"))
    implementation(project(":search-details-models"))

    implementation(libs.coroutines.android)
    implementation(Projects.common.coroutinesAnnotation)
    implementation(Projects.network.musicBrainzService)
    implementation(Projects.network.musicEntities)

    implementation(Projects.common.composeTestContract)
}
