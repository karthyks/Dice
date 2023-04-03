package com.karthyks.dice.network.interceptor

import com.karthyks.dice.network.config.NetworkConfig
import okhttp3.Interceptor
import okhttp3.Response

class ApiContextInterceptor(
    private val networkConfig: NetworkConfig,
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .header(HEADER_USER_AGENT, networkConfig.userAgent)
            .header(HEADER_RESPONSE_FORMAT, RESPONSE_FORMAT)
            .build()
        return chain.proceed(request)
    }

    companion object {
        const val HEADER_USER_AGENT = "User-Agent"
        const val HEADER_RESPONSE_FORMAT = "Accept"
        const val RESPONSE_FORMAT = "application/json"
    }
}
