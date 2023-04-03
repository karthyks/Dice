package com.karthyks.dice.search.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/karthyks/dice/search/mapper/ArtistMapper;", "", "mapArtist", "Lcom/karthyks/dice/search/state/Artist;", "artistItem", "Lcom/karthyks/dice/search/models/ArtistItem;", "search-presentation_debug"})
public abstract interface ArtistMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.karthyks.dice.search.state.Artist mapArtist(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.search.models.ArtistItem artistItem);
}