package com.karthyks.dice.app.di

import com.karthyks.dice.app.impl.NetworkConfigImpl
import com.karthyks.dice.network.config.NetworkConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object BuildConfigDIModule {

    @Provides
    @Singleton
    fun provideNetworkConfig(): NetworkConfig {
        return NetworkConfigImpl()
    }
}