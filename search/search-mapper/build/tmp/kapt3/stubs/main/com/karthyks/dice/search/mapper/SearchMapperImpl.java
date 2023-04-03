package com.karthyks.dice.search.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/karthyks/dice/search/mapper/SearchMapperImpl;", "Lcom/karthyks/dice/search/mapper/SearchMapper;", "()V", "mapArtistList", "Lcom/karthyks/dice/search/models/ArtistCollection;", "artistListEntity", "Lcom/karthyks/dice/network/entities/ArtistListEntity;", "mapToDomain", "Lcom/karthyks/dice/search/models/ArtistItem;", "artistEntity", "Lcom/karthyks/dice/network/entities/ArtistEntity;", "mapToSearchQuery", "Lcom/karthyks/dice/network/entities/ArtistQuery;", "searchTerm", "", "offset", "", "limit", "search-mapper"})
public final class SearchMapperImpl implements com.karthyks.dice.search.mapper.SearchMapper {
    
    public SearchMapperImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.karthyks.dice.search.models.ArtistCollection mapArtistList(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.entities.ArtistListEntity artistListEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.karthyks.dice.search.models.ArtistItem mapToDomain(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.entities.ArtistEntity artistEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.karthyks.dice.network.entities.ArtistQuery mapToSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, int offset, int limit) {
        return null;
    }
}