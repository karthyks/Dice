plugins {
    id("kotlin-library")
    id("hilt-dagger-core")
}

group = "${group}.network"

dependencies {
    implementation(project(":http-client"))
    implementation(project(":music-brainz-service"))
    implementation(project(":music-entities"))
    implementation(project(":network-config-provider"))

    implementation(libs.retrofit)
    implementation(libs.moshi)
    implementation(libs.okhttp)
}
