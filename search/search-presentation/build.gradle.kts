import com.karthyks.plugin.Projects

plugins {
    id("android-lib-plugin")
    id("hilt-dagger")
}

group = "${group}.search"

android {
    namespace = "com.karthyks.dice.search"
}

dependencies {
    implementation(libs.navigation.compose)

    implementation(project(":search-pager"))
    implementation(libs.pagingCompose)

    implementation(libs.coroutines.android)

    implementation(project(":repository:search-repository-provider"))
    implementation(project(":search-models"))
    implementation(Projects.common.coroutinesAnnotation)
    implementation(Projects.network.musicBrainzService)
    implementation(Projects.network.musicEntities)

    implementation(Projects.common.composeTestContract)
}