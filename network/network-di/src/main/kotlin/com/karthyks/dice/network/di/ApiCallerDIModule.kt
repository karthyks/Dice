package com.karthyks.dice.network.di

import com.karthyks.dice.network.helper.SafeApiCaller
import com.karthyks.dice.network.helper.SafeApiCallerImpl
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiCallerDIModule {
    @Provides
    @Singleton
    fun provideSafeApiCaller(moshi: Moshi): SafeApiCaller {
        return SafeApiCallerImpl(moshi)
    }
}