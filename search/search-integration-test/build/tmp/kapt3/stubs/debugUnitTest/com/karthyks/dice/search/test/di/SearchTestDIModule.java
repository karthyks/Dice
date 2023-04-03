package com.karthyks.dice.search.test.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/karthyks/dice/search/test/di/SearchTestDIModule;", "", "()V", "search-integration-test_debug"})
@dagger.Module(includes = {com.karthyks.dice.search.di.SearchBaseModule.class})
public final class SearchTestDIModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karthyks.dice.search.test.di.SearchTestDIModule INSTANCE = null;
    
    private SearchTestDIModule() {
        super();
    }
}