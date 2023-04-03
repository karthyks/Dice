import com.karthyks.plugin.Projects

plugins {
    id("kotlin-library")
}

group = "${group}.search"

dependencies {
    implementation(project(":search-models"))
}