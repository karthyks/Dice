import com.karthyks.plugin.Projects

plugins {
    id("kotlin-library")
    id("hilt-dagger-core")
}

group = "${group}.search-details"

dependencies {
    implementation(project(":search-details-models"))
    implementation(Projects.network.musicEntities)
}