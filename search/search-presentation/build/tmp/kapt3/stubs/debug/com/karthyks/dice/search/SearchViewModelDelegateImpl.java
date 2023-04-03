package com.karthyks.dice.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/karthyks/dice/search/SearchViewModelDelegateImpl;", "Lcom/karthyks/dice/search/SearchViewModelDelegate;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "dataSourceFactory", "Lcom/karthyks/dice/search/pager/DataSourceFactory;", "artistMapper", "Lcom/karthyks/dice/search/mapper/ArtistMapper;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/karthyks/dice/search/pager/DataSourceFactory;Lcom/karthyks/dice/search/mapper/ArtistMapper;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "screenState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/karthyks/dice/search/state/SearchScreenState;", "getScreenState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "searchJob", "Lkotlinx/coroutines/Job;", "close", "", "fetchArtists", "searchTerm", "", "onReady", "search-presentation_debug"})
public final class SearchViewModelDelegateImpl implements com.karthyks.dice.search.SearchViewModelDelegate, java.io.Closeable, kotlinx.coroutines.CoroutineScope {
    private final com.karthyks.dice.search.pager.DataSourceFactory dataSourceFactory = null;
    private final com.karthyks.dice.search.mapper.ArtistMapper artistMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.karthyks.dice.search.state.SearchScreenState> screenState = null;
    private kotlinx.coroutines.Job searchJob;
    
    @javax.inject.Inject()
    public SearchViewModelDelegateImpl(@org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Main()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.search.pager.DataSourceFactory dataSourceFactory, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.search.mapper.ArtistMapper artistMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.MutableStateFlow<com.karthyks.dice.search.state.SearchScreenState> getScreenState() {
        return null;
    }
    
    @java.lang.Override()
    public void onReady() {
    }
    
    @java.lang.Override()
    public void fetchArtists(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm) {
    }
    
    @java.lang.Override()
    public void close() {
    }
}