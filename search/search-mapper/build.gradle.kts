import com.karthyks.plugin.Projects

plugins {
    id("kotlin-library")
    id("hilt-dagger-core")
}

group = "${group}.search"

dependencies {
    implementation(project(":search-models"))
    implementation(Projects.network.musicEntities)
}