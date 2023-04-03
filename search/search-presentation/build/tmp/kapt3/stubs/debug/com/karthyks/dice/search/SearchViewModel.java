package com.karthyks.dice.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\fH\u0096\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0010\u001a\u00020\fH\u0096\u0001R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/karthyks/dice/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/karthyks/dice/search/SearchViewModelDelegate;", "searchViewModelDelegate", "Lcom/karthyks/dice/search/SearchViewModelDelegateImpl;", "(Lcom/karthyks/dice/search/SearchViewModelDelegateImpl;)V", "screenState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/karthyks/dice/search/state/SearchScreenState;", "getScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "close", "", "fetchArtists", "searchTerm", "", "onReady", "search-presentation_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel implements com.karthyks.dice.search.SearchViewModelDelegate {
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.search.SearchViewModelDelegateImpl searchViewModelDelegate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.StateFlow<com.karthyks.dice.search.state.SearchScreenState> getScreenState() {
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