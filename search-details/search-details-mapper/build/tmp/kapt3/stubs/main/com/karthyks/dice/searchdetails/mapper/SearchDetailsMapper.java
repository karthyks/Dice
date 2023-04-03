package com.karthyks.dice.searchdetails.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/karthyks/dice/searchdetails/mapper/SearchDetailsMapper;", "", "toDomainModel", "Lcom/karthyks/dice/searchdetails/models/ArtistDetail;", "artistEntity", "Lcom/karthyks/dice/network/entities/ArtistEntity;", "search-details-mapper"})
public abstract interface SearchDetailsMapper {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.karthyks.dice.searchdetails.models.ArtistDetail toDomainModel(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.network.entities.ArtistEntity artistEntity);
}