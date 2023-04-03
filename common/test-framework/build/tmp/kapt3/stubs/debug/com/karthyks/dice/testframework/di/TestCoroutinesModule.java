package com.karthyks.dice.testframework.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/karthyks/dice/testframework/di/TestCoroutinesModule;", "", "()V", "provideDefaultCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "testDispatcher", "provideIOCoroutineDispatcher", "provideImmediateCoroutineDispatcher", "provideMainCoroutineDispatcher", "provideTestDispatcher", "testScheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "provideTestScheduler", "test-framework_debug"})
@dagger.Module()
public final class TestCoroutinesModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karthyks.dice.testframework.di.TestCoroutinesModule INSTANCE = null;
    
    private TestCoroutinesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Default()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideDefaultCoroutineDispatcher(@org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Test()
    kotlinx.coroutines.CoroutineDispatcher testDispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Main()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideMainCoroutineDispatcher(@org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Test()
    kotlinx.coroutines.CoroutineDispatcher testDispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Immediate()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideImmediateCoroutineDispatcher(@org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Test()
    kotlinx.coroutines.CoroutineDispatcher testDispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.IO()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideIOCoroutineDispatcher(@org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Test()
    kotlinx.coroutines.CoroutineDispatcher testDispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Test()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideTestDispatcher(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.test.TestCoroutineScheduler testScheduler) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.test.TestCoroutineScheduler provideTestScheduler() {
        return null;
    }
}