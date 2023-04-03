package com.karthyks.dice.search.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/karthyks/dice/search/di/ArtistMapperModule;", "", "()V", "provideArtistMapper", "Lcom/karthyks/dice/search/mapper/ArtistMapper;", "artistStringProvider", "Lcom/karthyks/dice/search/resource/ArtistStringProvider;", "search-presentation_debug"})
@dagger.hilt.migration.DisableInstallInCheck()
@dagger.Module()
public final class ArtistMapperModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karthyks.dice.search.di.ArtistMapperModule INSTANCE = null;
    
    private ArtistMapperModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final com.karthyks.dice.search.mapper.ArtistMapper provideArtistMapper(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.search.resource.ArtistStringProvider artistStringProvider) {
        return null;
    }
}