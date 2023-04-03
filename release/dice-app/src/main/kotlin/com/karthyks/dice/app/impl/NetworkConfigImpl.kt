package com.karthyks.dice.app.impl

import com.karthyks.dice.app.BuildConfig
import com.karthyks.dice.network.config.NetworkConfig

internal class NetworkConfigImpl : NetworkConfig {
    override val baseUrl: String get() = BuildConfig.BASE_WEB_URL
    override val userAgent: String get() = BuildConfig.USER_AGENT
}