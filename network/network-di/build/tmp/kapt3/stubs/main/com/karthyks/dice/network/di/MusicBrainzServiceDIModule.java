package com.karthyks.dice.network.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/karthyks/dice/network/di/MusicBrainzServiceDIModule;", "", "()V", "provideMusicBrainzEndpoint", "Lcom/karthyks/dice/network/endpoint/MusicBrainzEndpoint;", "retrofit", "Lretrofit2/Retrofit;", "provideMusicBrainzService", "Lcom/karthyks/dice/service/musicbrainz/MusicBrainzService;", "musicBrainzEndpoint", "safeApiCaller", "Lcom/karthyks/dice/network/helper/SafeApiCaller;", "network-di"})
@dagger.Module()
public final class MusicBrainzServiceDIModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karthyks.dice.network.di.MusicBrainzServiceDIModule INSTANCE = null;
    
    private MusicBrainzServiceDIModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.karthyks.dice.service.musicbrainz.MusicBrainzService provideMusicBrainzService(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.endpoint.MusicBrainzEndpoint musicBrainzEndpoint, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.helper.SafeApiCaller safeApiCaller) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.karthyks.dice.network.endpoint.MusicBrainzEndpoint provideMusicBrainzEndpoint(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}