package com.karthyks.dice.network

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object OkHttpClientBuilder {
    fun newInstance(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(REGULAR_API_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
            .connectTimeout(REGULAR_API_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
            .writeTimeout(REGULAR_API_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
            .build()
    }

    private const val REGULAR_API_TIMEOUT = 2_000
}
