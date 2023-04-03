@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import com.android.build.api.dsl.BuildType
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

internal fun BaseAppModuleExtension.configureBuildTypes() {
    buildTypes {
        getByName("debug") {
            isDebuggable = true
            applicationIdSuffix = ".debug"
            isMinifyEnabled = false
            isShrinkResources = false
        }
        buildTypes.onEach {
            it.setBaseWebUrl(BaseWebUrl)
            it.setUserAgent(UserAgent)
        }
    }
}

private fun BuildType.setBaseWebUrl(baseWebUrl: BaseWebUrl) {
    buildConfigField("String", "BASE_WEB_URL", "\"${baseWebUrl.value}\"")
}

private fun BuildType.setUserAgent(userAgent: UserAgent) {
    buildConfigField("String", "USER_AGENT", "\"${userAgent.value}\"")
}
