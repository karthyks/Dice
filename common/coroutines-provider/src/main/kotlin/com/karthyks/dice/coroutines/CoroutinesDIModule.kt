package com.karthyks.dice.coroutines

import com.karthyks.dice.coroutines.annotation.Default
import com.karthyks.dice.coroutines.annotation.IO
import com.karthyks.dice.coroutines.annotation.Immediate
import com.karthyks.dice.coroutines.annotation.Main
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoroutinesDIModule {

    @Provides
    @Singleton
    @Default
    fun provideDefaultCoroutineDispatcher(): CoroutineDispatcher {
        return Dispatchers.Default
    }

    @Provides
    @Singleton
    @Main
    fun provideMainCoroutineDispatcher(): CoroutineDispatcher {
        return Dispatchers.Main
    }

    @Provides
    @Singleton
    @Immediate
    fun provideImmediateCoroutineDispatcher(): CoroutineDispatcher {
        return Dispatchers.Main.immediate
    }

    @Provides
    @Singleton
    @IO
    fun provideIOCoroutineDispatcher(): CoroutineDispatcher {
        return Dispatchers.IO
    }
}