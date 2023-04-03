package com.karthyks.dice.searchdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/karthyks/dice/searchdetails/SearchDetailsViewModelDelegate;", "Ljava/io/Closeable;", "screenState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState;", "getScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "onReady", "", "artistID", "", "search-details-presentation_debug"})
public abstract interface SearchDetailsViewModelDelegate extends java.io.Closeable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<com.karthyks.dice.searchdetails.states.ArtistDetailScreenState> getScreenState();
    
    public abstract void onReady(@org.jetbrains.annotations.NotNull()
    java.lang.String artistID);
}