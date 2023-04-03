@file:OptIn(ExperimentalCoroutinesApi::class)

package com.karthyks.dice.testframework.di

import com.karthyks.dice.coroutines.annotation.Default
import com.karthyks.dice.coroutines.annotation.IO
import com.karthyks.dice.coroutines.annotation.Immediate
import com.karthyks.dice.coroutines.annotation.Main
import com.karthyks.dice.coroutines.annotation.Test
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestCoroutineScheduler
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object TestCoroutinesModule {

    @Provides
    @Singleton
    @Default
    fun provideDefaultCoroutineDispatcher(@Test testDispatcher: CoroutineDispatcher): CoroutineDispatcher {
        return testDispatcher
    }

    @Provides
    @Singleton
    @Main
    fun provideMainCoroutineDispatcher(@Test testDispatcher: CoroutineDispatcher): CoroutineDispatcher {
        return testDispatcher
    }

    @Provides
    @Singleton
    @Immediate
    fun provideImmediateCoroutineDispatcher(@Test testDispatcher: CoroutineDispatcher): CoroutineDispatcher {
        return testDispatcher
    }

    @Provides
    @Singleton
    @IO
    fun provideIOCoroutineDispatcher(@Test testDispatcher: CoroutineDispatcher): CoroutineDispatcher {
        return testDispatcher
    }

    @Provides
    @Singleton
    @Test
    fun provideTestDispatcher(testScheduler: TestCoroutineScheduler): CoroutineDispatcher {
        return StandardTestDispatcher(testScheduler)
    }

    @Provides
    @Singleton
    fun provideTestScheduler(): TestCoroutineScheduler {
        return TestCoroutineScheduler()
    }
}
