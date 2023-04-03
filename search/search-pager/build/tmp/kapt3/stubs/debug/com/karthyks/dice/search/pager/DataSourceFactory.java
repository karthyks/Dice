package com.karthyks.dice.search.pager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/karthyks/dice/search/pager/DataSourceFactory;", "", "create", "Landroidx/paging/Pager;", "", "Lcom/karthyks/dice/search/models/ArtistItem;", "searchTerm", "", "search-pager_debug"})
public abstract interface DataSourceFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.Pager<java.lang.Integer, com.karthyks.dice.search.models.ArtistItem> create(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm);
}