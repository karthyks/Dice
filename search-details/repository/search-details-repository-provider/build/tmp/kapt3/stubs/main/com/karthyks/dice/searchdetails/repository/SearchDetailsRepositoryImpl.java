package com.karthyks.dice.searchdetails.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/karthyks/dice/searchdetails/repository/SearchDetailsRepositoryImpl;", "Lcom/karthyks/dice/searchdetails/repository/SearchDetailsRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "musicBrainzService", "Lcom/karthyks/dice/service/musicbrainz/MusicBrainzService;", "searchDetailsMapper", "Lcom/karthyks/dice/searchdetails/mapper/SearchDetailsMapper;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/karthyks/dice/service/musicbrainz/MusicBrainzService;Lcom/karthyks/dice/searchdetails/mapper/SearchDetailsMapper;)V", "fetchArtistDetails", "Lkotlin/Result;", "Lcom/karthyks/dice/searchdetails/models/ArtistDetail;", "artistID", "", "fetchArtistDetails-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search-details-repository-provider"})
public final class SearchDetailsRepositoryImpl implements com.karthyks.dice.searchdetails.repository.SearchDetailsRepository {
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private final com.karthyks.dice.service.musicbrainz.MusicBrainzService musicBrainzService = null;
    private final com.karthyks.dice.searchdetails.mapper.SearchDetailsMapper searchDetailsMapper = null;
    
    @javax.inject.Inject()
    public SearchDetailsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.IO()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.service.musicbrainz.MusicBrainzService musicBrainzService, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.searchdetails.mapper.SearchDetailsMapper searchDetailsMapper) {
        super();
    }
}