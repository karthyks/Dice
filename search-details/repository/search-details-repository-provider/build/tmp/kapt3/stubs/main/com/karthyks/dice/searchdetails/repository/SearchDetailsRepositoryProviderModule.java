package com.karthyks.dice.searchdetails.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/karthyks/dice/searchdetails/repository/SearchDetailsRepositoryProviderModule;", "", "()V", "provideSearchDetailsRepository", "Lcom/karthyks/dice/searchdetails/repository/SearchDetailsRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "musicBrainzService", "Lcom/karthyks/dice/service/musicbrainz/MusicBrainzService;", "searchDetailsMapper", "Lcom/karthyks/dice/searchdetails/mapper/SearchDetailsMapper;", "search-details-repository-provider"})
@dagger.hilt.migration.DisableInstallInCheck()
@dagger.Module(includes = {com.karthyks.dice.searchdetails.mapper.SearchDetailsMapperModule.class})
public final class SearchDetailsRepositoryProviderModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karthyks.dice.searchdetails.repository.SearchDetailsRepositoryProviderModule INSTANCE = null;
    
    private SearchDetailsRepositoryProviderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final com.karthyks.dice.searchdetails.repository.SearchDetailsRepository provideSearchDetailsRepository(@org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.IO()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.service.musicbrainz.MusicBrainzService musicBrainzService, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.searchdetails.mapper.SearchDetailsMapper searchDetailsMapper) {
        return null;
    }
}