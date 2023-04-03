package com.karthyks.dice.searchdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/karthyks/dice/searchdetails/SearchDetailsViewModelDelegateImpl;", "Lcom/karthyks/dice/searchdetails/SearchDetailsViewModelDelegate;", "Lkotlinx/coroutines/CoroutineScope;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "searchDetailsRepository", "Lcom/karthyks/dice/searchdetails/repository/SearchDetailsRepository;", "artistStateMapper", "Lcom/karthyks/dice/searchdetails/mapper/ArtistStateMapper;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/karthyks/dice/searchdetails/repository/SearchDetailsRepository;Lcom/karthyks/dice/searchdetails/mapper/ArtistStateMapper;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "screenState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState;", "getScreenState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "close", "", "onReady", "artistID", "", "search-details-presentation_debug"})
public final class SearchDetailsViewModelDelegateImpl implements com.karthyks.dice.searchdetails.SearchDetailsViewModelDelegate, kotlinx.coroutines.CoroutineScope {
    private final com.karthyks.dice.searchdetails.repository.SearchDetailsRepository searchDetailsRepository = null;
    private final com.karthyks.dice.searchdetails.mapper.ArtistStateMapper artistStateMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.karthyks.dice.searchdetails.states.ArtistDetailScreenState> screenState = null;
    
    @javax.inject.Inject()
    public SearchDetailsViewModelDelegateImpl(@org.jetbrains.annotations.NotNull()
    @com.karthyks.dice.coroutines.annotation.Main()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.searchdetails.repository.SearchDetailsRepository searchDetailsRepository, @org.jetbrains.annotations.NotNull()
    com.karthyks.dice.searchdetails.mapper.ArtistStateMapper artistStateMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.MutableStateFlow<com.karthyks.dice.searchdetails.states.ArtistDetailScreenState> getScreenState() {
        return null;
    }
    
    @java.lang.Override()
    public void onReady(@org.jetbrains.annotations.NotNull()
    java.lang.String artistID) {
    }
    
    @java.lang.Override()
    public void close() {
    }
}