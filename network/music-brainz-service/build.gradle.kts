plugins {
    id("kotlin-library")
}

group = "${group}.network"

dependencies {
    implementation(project(":music-entities"))
}