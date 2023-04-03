package com.karthyks.dice.network

import com.karthyks.dice.network.config.NetworkConfig
import com.squareup.moshi.Moshi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitBuilder(
    private val okHttpClient: OkHttpClient,
    private val networkConfig: NetworkConfig,
    private val interceptors: @JvmSuppressWildcards Set<Interceptor>,
    private val moshi: Moshi
) {
    fun newInstance(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(
                okHttpClient.newBuilder()
                    .apply {
                        interceptors.forEach(::addInterceptor)
                    }
                    .build()
            )
            .baseUrl(networkConfig.baseUrl)
            .build()
    }
}
