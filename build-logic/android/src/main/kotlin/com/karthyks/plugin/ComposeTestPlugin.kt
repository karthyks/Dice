package com.karthyks.plugin

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

@Suppress("UnstableApiUsage")
class ComposeTestPlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        platformImplementation(libs.androidx.compose.bom)
        implementation(libs.androidx.compose.ui)
        implementation(libs.androidx.compose.uiTooling)
        implementation(libs.androidx.compose.foundation)
        implementation(libs.androidx.compose.foundationLayout)
        implementation(libs.androidx.compose.material)

        androidTestImplementation(libs.androidx.compose.testJunitVersioned)
        debugImplementation(libs.androidx.compose.uiManifestVersioned)

        implementation(libs.viewModel.compose)
        implementation(libs.savedstate)
        implementation(libs.androidx.core)

        target.configure<BaseExtension> {
            buildFeatures.compose = true
            composeOptions {
                kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
            }
        }
    }
}
