package com.karthyks.dice.searchdetails.states;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState;", "", "ArtistDetailLoaded", "Error", "Loading", "Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState$ArtistDetailLoaded;", "Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState$Error;", "Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState$Loading;", "search-details-presentation_debug"})
public abstract interface ArtistDetailScreenState {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState$ArtistDetailLoaded;", "Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState;", "artistDetail", "Lcom/karthyks/dice/searchdetails/states/ArtistState;", "(Lcom/karthyks/dice/searchdetails/states/ArtistState;)V", "getArtistDetail", "()Lcom/karthyks/dice/searchdetails/states/ArtistState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "search-details-presentation_debug"})
    public static final class ArtistDetailLoaded implements com.karthyks.dice.searchdetails.states.ArtistDetailScreenState {
        @org.jetbrains.annotations.NotNull()
        private final com.karthyks.dice.searchdetails.states.ArtistState artistDetail = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.karthyks.dice.searchdetails.states.ArtistDetailScreenState.ArtistDetailLoaded copy(@org.jetbrains.annotations.NotNull()
        com.karthyks.dice.searchdetails.states.ArtistState artistDetail) {
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
        
        public ArtistDetailLoaded(@org.jetbrains.annotations.NotNull()
        com.karthyks.dice.searchdetails.states.ArtistState artistDetail) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.karthyks.dice.searchdetails.states.ArtistState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.karthyks.dice.searchdetails.states.ArtistState getArtistDetail() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState$Error;", "Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState;", "()V", "search-details-presentation_debug"})
    public static final class Error implements com.karthyks.dice.searchdetails.states.ArtistDetailScreenState {
        @org.jetbrains.annotations.NotNull()
        public static final com.karthyks.dice.searchdetails.states.ArtistDetailScreenState.Error INSTANCE = null;
        
        private Error() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState$Loading;", "Lcom/karthyks/dice/searchdetails/states/ArtistDetailScreenState;", "()V", "search-details-presentation_debug"})
    public static final class Loading implements com.karthyks.dice.searchdetails.states.ArtistDetailScreenState {
        @org.jetbrains.annotations.NotNull()
        public static final com.karthyks.dice.searchdetails.states.ArtistDetailScreenState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}