import com.karthyks.plugin.Projects

plugins {
    id("kotlin-library")
    id("hilt-dagger-core")
}

group = "${group}.search-details"

dependencies {
    implementation(project(":repository:search-details-repository-contract"))
    implementation(project(":search-details-models"))
    implementation(project(":search-details-mapper"))

    implementation(libs.coroutines.core)
    implementation(Projects.common.coroutinesAnnotation)
    implementation(Projects.network.musicBrainzService)
    implementation(Projects.network.musicEntities)

    testImplementation(libs.mockk)
    testImplementation(libs.coroutines.test)
}