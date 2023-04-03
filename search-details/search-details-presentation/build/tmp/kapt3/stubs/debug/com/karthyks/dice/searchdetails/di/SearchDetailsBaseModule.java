package com.karthyks.dice.searchdetails.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/karthyks/dice/searchdetails/di/SearchDetailsBaseModule;", "", "()V", "search-details-presentation_debug"})
@dagger.hilt.migration.DisableInstallInCheck()
@dagger.Module(includes = {com.karthyks.dice.searchdetails.di.ArtistStateMapperModule.class, com.karthyks.dice.searchdetails.repository.SearchDetailsRepositoryProviderModule.class})
public final class SearchDetailsBaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karthyks.dice.searchdetails.di.SearchDetailsBaseModule INSTANCE = null;
    
    private SearchDetailsBaseModule() {
        super();
    }
}