package com.karthyks.dice.network.di

import com.karthyks.dice.network.OkHttpClientBuilder
import com.karthyks.dice.network.RetrofitBuilder
import com.karthyks.dice.network.config.NetworkConfig
import com.karthyks.dice.network.interceptor.ApiContextInterceptor
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkDIModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClientBuilder.newInstance()
    }

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder().build()
    }

    @Provides
    @IntoSet
    fun provideApiContextInterceptor(networkConfig: NetworkConfig): Interceptor {
        return ApiContextInterceptor(networkConfig)
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        networkConfig: NetworkConfig,
        interceptors: @JvmSuppressWildcards Set<Interceptor>,
        moshi: Moshi,
    ): Retrofit {
        return RetrofitBuilder(
            okHttpClient,
            networkConfig,
            interceptors,
            moshi
        ).newInstance()
    }
}
