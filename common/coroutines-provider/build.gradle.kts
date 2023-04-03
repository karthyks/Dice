plugins {
    id("android-lib-plugin")
    id("hilt-dagger")
}
group = "${group}.common"

android {
    namespace = "com.karthyks.dice.coroutines"
}

dependencies {
    implementation(project(":coroutines-annotation"))
}