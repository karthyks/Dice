import com.karthyks.plugin.Projects

plugins {
    id("kotlin-library")
    id("hilt-dagger-core")
}

group = "${group}.search"

dependencies {
    implementation(project(":repository:search-repository-contract"))
    implementation(project(":search-models"))
    implementation(project(":search-mapper"))
    implementation(Projects.network.musicEntities)
    implementation(Projects.network.musicBrainzService)

    implementation(libs.coroutines.core)
    implementation(Projects.common.coroutinesAnnotation)
    testImplementation(libs.coroutines.test)
    testImplementation(libs.mockk)
}