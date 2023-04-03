plugins {
    id("kotlin-library")
}

group = "${group}.search-details"

dependencies {
    implementation(project(":search-details-models"))
}