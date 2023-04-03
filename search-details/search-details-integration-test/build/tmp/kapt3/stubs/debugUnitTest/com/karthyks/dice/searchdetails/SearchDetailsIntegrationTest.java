package com.karthyks.dice.searchdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/karthyks/dice/searchdetails/SearchDetailsIntegrationTest;", "Lcom/karthyks/dice/testframework/BaseTest;", "()V", "onFeature", "Lcom/karthyks/dice/searchdetails/SearchDetailsFeature;", "getOnFeature", "()Lcom/karthyks/dice/searchdetails/SearchDetailsFeature;", "onFeature$delegate", "Lkotlin/Lazy;", "searchDetailsViewModelDelegate", "Lcom/karthyks/dice/searchdetails/SearchDetailsViewModelDelegateImpl;", "getSearchDetailsViewModelDelegate", "()Lcom/karthyks/dice/searchdetails/SearchDetailsViewModelDelegateImpl;", "setSearchDetailsViewModelDelegate", "(Lcom/karthyks/dice/searchdetails/SearchDetailsViewModelDelegateImpl;)V", "shouldRenderError", "", "shouldRenderSearchDetails", "search-details-integration-test_debug"})
@dagger.hilt.android.testing.HiltAndroidTest()
public final class SearchDetailsIntegrationTest extends com.karthyks.dice.testframework.BaseTest {
    @javax.inject.Inject()
    public com.karthyks.dice.searchdetails.SearchDetailsViewModelDelegateImpl searchDetailsViewModelDelegate;
    private final kotlin.Lazy onFeature$delegate = null;
    
    public SearchDetailsIntegrationTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.karthyks.dice.searchdetails.SearchDetailsViewModelDelegateImpl getSearchDetailsViewModelDelegate() {
        return null;
    }
    
    public final void setSearchDetailsViewModelDelegate(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.searchdetails.SearchDetailsViewModelDelegateImpl p0) {
    }
    
    private final com.karthyks.dice.searchdetails.SearchDetailsFeature getOnFeature() {
        return null;
    }
    
    @org.junit.Test()
    public final void shouldRenderSearchDetails() {
    }
    
    @org.junit.Test()
    public final void shouldRenderError() {
    }
}