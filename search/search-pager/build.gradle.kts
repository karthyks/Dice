import com.karthyks.plugin.Projects

plugins {
    id("android-lib-plugin")
    id("hilt-dagger")
}

group = "${group}.search"

android {
    namespace = "com.karthyks.dice.search.pager"
}

dependencies {
    implementation(libs.paging)

    implementation(project(":repository:search-repository-contract"))
    implementation(project(":search-models"))
}