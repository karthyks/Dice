package com.karthyks.dice.search.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/karthyks/dice/search/state/SearchScreenState;", "", "InitialState", "SearchErrorState", "SearchResultState", "Lcom/karthyks/dice/search/state/SearchScreenState$InitialState;", "Lcom/karthyks/dice/search/state/SearchScreenState$SearchErrorState;", "Lcom/karthyks/dice/search/state/SearchScreenState$SearchResultState;", "search-presentation_debug"})
public abstract interface SearchScreenState {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/karthyks/dice/search/state/SearchScreenState$SearchResultState;", "Lcom/karthyks/dice/search/state/SearchScreenState;", "searchTerm", "", "artistPager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/karthyks/dice/search/state/Artist;", "(Ljava/lang/String;Lkotlinx/coroutines/flow/Flow;)V", "getArtistPager", "()Lkotlinx/coroutines/flow/Flow;", "getSearchTerm", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "search-presentation_debug"})
    public static final class SearchResultState implements com.karthyks.dice.search.state.SearchScreenState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String searchTerm = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.karthyks.dice.search.state.Artist>> artistPager = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.karthyks.dice.search.state.SearchScreenState.SearchResultState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.karthyks.dice.search.state.Artist>> artistPager) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SearchResultState(@org.jetbrains.annotations.NotNull()
        java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.karthyks.dice.search.state.Artist>> artistPager) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearchTerm() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.karthyks.dice.search.state.Artist>> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.karthyks.dice.search.state.Artist>> getArtistPager() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/karthyks/dice/search/state/SearchScreenState$InitialState;", "Lcom/karthyks/dice/search/state/SearchScreenState;", "searchTerm", "", "(Ljava/lang/String;)V", "getSearchTerm", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "search-presentation_debug"})
    public static final class InitialState implements com.karthyks.dice.search.state.SearchScreenState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String searchTerm = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.karthyks.dice.search.state.SearchScreenState.InitialState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String searchTerm) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public InitialState(@org.jetbrains.annotations.NotNull()
        java.lang.String searchTerm) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearchTerm() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/karthyks/dice/search/state/SearchScreenState$SearchErrorState;", "Lcom/karthyks/dice/search/state/SearchScreenState;", "searchTerm", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getSearchTerm", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "search-presentation_debug"})
    public static final class SearchErrorState implements com.karthyks.dice.search.state.SearchScreenState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String searchTerm = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errorMessage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.karthyks.dice.search.state.SearchScreenState.SearchErrorState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SearchErrorState(@org.jetbrains.annotations.NotNull()
        java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearchTerm() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getErrorMessage() {
            return null;
        }
    }
}