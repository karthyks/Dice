package com.karthyks.dice.coroutines;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/karthyks/dice/coroutines/CoroutinesDIModule;", "", "()V", "provideDefaultCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideIOCoroutineDispatcher", "provideImmediateCoroutineDispatcher", "provideMainCoroutineDispatcher", "coroutines-provider_debug"})
@dagger.Module()
public final class CoroutinesDIModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karthyks.dice.coroutines.CoroutinesDIModule INSTANCE = null;
    
    private CoroutinesDIModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Default()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideDefaultCoroutineDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Main()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideMainCoroutineDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Immediate()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideImmediateCoroutineDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.IO()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideIOCoroutineDispatcher() {
        return null;
    }
}