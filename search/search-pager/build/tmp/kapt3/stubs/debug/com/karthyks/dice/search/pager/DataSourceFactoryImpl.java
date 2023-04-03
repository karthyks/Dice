package com.karthyks.dice.search.pager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/karthyks/dice/search/pager/DataSourceFactoryImpl;", "Lcom/karthyks/dice/search/pager/DataSourceFactory;", "searchRepository", "Lcom/karthyks/dice/search/repository/SearchRepository;", "(Lcom/karthyks/dice/search/repository/SearchRepository;)V", "create", "Landroidx/paging/Pager;", "", "Lcom/karthyks/dice/search/models/ArtistItem;", "searchTerm", "", "search-pager_debug"})
public final class DataSourceFactoryImpl implements com.karthyks.dice.search.pager.DataSourceFactory {
    private final com.karthyks.dice.search.repository.SearchRepository searchRepository = null;
    
    public DataSourceFactoryImpl(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.search.repository.SearchRepository searchRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.Pager<java.lang.Integer, com.karthyks.dice.search.models.ArtistItem> create(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm) {
        return null;
    }
}