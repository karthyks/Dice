package com.karthyks.dice.network.di.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/karthyks/dice/network/di/impl/MusicBrainzServiceImpl;", "Lcom/karthyks/dice/service/musicbrainz/MusicBrainzService;", "safeApiCaller", "Lcom/karthyks/dice/network/helper/SafeApiCaller;", "musicBrainzEndpoint", "Lcom/karthyks/dice/network/endpoint/MusicBrainzEndpoint;", "(Lcom/karthyks/dice/network/helper/SafeApiCaller;Lcom/karthyks/dice/network/endpoint/MusicBrainzEndpoint;)V", "fetchArtistDetails", "Lkotlin/Result;", "Lcom/karthyks/dice/network/entities/ArtistEntity;", "id", "", "fetchArtistDetails-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchArtists", "Lcom/karthyks/dice/network/entities/ArtistListEntity;", "query", "Lcom/karthyks/dice/network/entities/ArtistQuery;", "fetchArtists-gIAlu-s", "(Lcom/karthyks/dice/network/entities/ArtistQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network-di"})
public final class MusicBrainzServiceImpl implements com.karthyks.dice.service.musicbrainz.MusicBrainzService {
    private final com.karthyks.dice.network.helper.SafeApiCaller safeApiCaller = null;
    private final com.karthyks.dice.network.endpoint.MusicBrainzEndpoint musicBrainzEndpoint = null;
    
    public MusicBrainzServiceImpl(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.helper.SafeApiCaller safeApiCaller, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.endpoint.MusicBrainzEndpoint musicBrainzEndpoint) {
        super();
    }
}