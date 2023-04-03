package com.karthyks.dice.testframework.di

import com.karthyks.dice.network.config.NetworkConfig
import com.karthyks.dice.testframework.ServerPort
import com.karthyks.dice.testframework.getServerPort
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestModule {

    @Singleton
    @Provides
    fun provideServerPort(): ServerPort {
        return ServerPort(getServerPort())
    }

    @Singleton
    @Provides
    fun provideNetworkConfig(serverPort: ServerPort): NetworkConfig {
        return object : NetworkConfig {
            override val baseUrl: String = "http://127.0.0.1:${serverPort.port}/"
            override val userAgent: String = "TestAppPlugin"
        }
    }
}
