package com.karthyks.dice.search.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/karthyks/dice/search/repository/SearchRepositoryImpl;", "Lcom/karthyks/dice/search/repository/SearchRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "musicBrainzService", "Lcom/karthyks/dice/service/musicbrainz/MusicBrainzService;", "searchMapper", "Lcom/karthyks/dice/search/mapper/SearchMapper;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/karthyks/dice/service/musicbrainz/MusicBrainzService;Lcom/karthyks/dice/search/mapper/SearchMapper;)V", "fetchArtists", "Lkotlin/Result;", "Lcom/karthyks/dice/search/models/ArtistCollection;", "searchTerm", "", "offset", "", "fetchArtists-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search-repository-provider"})
public final class SearchRepositoryImpl implements com.karthyks.dice.search.repository.SearchRepository {
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private final com.karthyks.dice.service.musicbrainz.MusicBrainzService musicBrainzService = null;
    private final com.karthyks.dice.search.mapper.SearchMapper searchMapper = null;
    
    public SearchRepositoryImpl(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.service.musicbrainz.MusicBrainzService musicBrainzService, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.search.mapper.SearchMapper searchMapper) {
        super();
    }
}