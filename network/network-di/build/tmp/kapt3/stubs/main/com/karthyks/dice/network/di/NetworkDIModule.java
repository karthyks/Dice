package com.karthyks.dice.network.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J3\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/karthyks/dice/network/di/NetworkDIModule;", "", "()V", "provideApiContextInterceptor", "Lokhttp3/Interceptor;", "networkConfig", "Lcom/karthyks/dice/network/config/NetworkConfig;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "interceptors", "", "Lkotlin/jvm/JvmSuppressWildcards;", "moshi", "network-di"})
@dagger.Module()
public final class NetworkDIModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karthyks.dice.network.di.NetworkDIModule INSTANCE = null;
    
    private NetworkDIModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntoSet()
    @dagger.Provides()
    public final okhttp3.Interceptor provideApiContextInterceptor(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.config.NetworkConfig networkConfig) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.config.NetworkConfig networkConfig, @org.jetbrains.annotations.NotNull()
    java.util.Set<okhttp3.Interceptor> interceptors, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
}