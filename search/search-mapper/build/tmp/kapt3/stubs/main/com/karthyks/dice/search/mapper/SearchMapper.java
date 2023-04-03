package com.karthyks.dice.search.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&\u00a8\u0006\u0011"}, d2 = {"Lcom/karthyks/dice/search/mapper/SearchMapper;", "", "mapArtistList", "Lcom/karthyks/dice/search/models/ArtistCollection;", "artistListEntity", "Lcom/karthyks/dice/network/entities/ArtistListEntity;", "mapToDomain", "Lcom/karthyks/dice/search/models/ArtistItem;", "artistEntity", "Lcom/karthyks/dice/network/entities/ArtistEntity;", "mapToSearchQuery", "Lcom/karthyks/dice/network/entities/ArtistQuery;", "searchTerm", "", "offset", "", "limit", "search-mapper"})
public abstract interface SearchMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.karthyks.dice.search.models.ArtistCollection mapArtistList(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.entities.ArtistListEntity artistListEntity);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.karthyks.dice.search.models.ArtistItem mapToDomain(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.entities.ArtistEntity artistEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.karthyks.dice.network.entities.ArtistQuery mapToSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm, int offset, int limit);
}