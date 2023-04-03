package com.karthyks.dice.search.test;

import com.karthyks.dice.search.SearchViewModelDelegateImpl;
import com.karthyks.dice.testframework.BaseTest_MembersInjector;
import com.karthyks.dice.testframework.ServerPort;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchIntegrationTest_MembersInjector implements MembersInjector<SearchIntegrationTest> {
  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  private final Provider<ServerPort> serverPortProvider;

  private final Provider<SearchViewModelDelegateImpl> searchViewModelDelegateProvider;

  public SearchIntegrationTest_MembersInjector(
      Provider<CoroutineDispatcher> coroutineDispatcherProvider,
      Provider<ServerPort> serverPortProvider,
      Provider<SearchViewModelDelegateImpl> searchViewModelDelegateProvider) {
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
    this.serverPortProvider = serverPortProvider;
    this.searchViewModelDelegateProvider = searchViewModelDelegateProvider;
  }

  public static MembersInjector<SearchIntegrationTest> create(
      Provider<CoroutineDispatcher> coroutineDispatcherProvider,
      Provider<ServerPort> serverPortProvider,
      Provider<SearchViewModelDelegateImpl> searchViewModelDelegateProvider) {
    return new SearchIntegrationTest_MembersInjector(coroutineDispatcherProvider, serverPortProvider, searchViewModelDelegateProvider);
  }

  @Override
  public void injectMembers(SearchIntegrationTest instance) {
    BaseTest_MembersInjector.injectCoroutineDispatcher(instance, coroutineDispatcherProvider.get());
    BaseTest_MembersInjector.injectServerPort(instance, serverPortProvider.get());
    injectSearchViewModelDelegate(instance, searchViewModelDelegateProvider.get());
  }

  @InjectedFieldSignature("com.karthyks.dice.search.test.SearchIntegrationTest.searchViewModelDelegate")
  public static void injectSearchViewModelDelegate(SearchIntegrationTest instance,
      SearchViewModelDelegateImpl searchViewModelDelegate) {
    instance.searchViewModelDelegate = searchViewModelDelegate;
  }
}
