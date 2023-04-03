package com.karthyks.dice.searchdetails;

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
public final class SearchDetailsIntegrationTest_MembersInjector implements MembersInjector<SearchDetailsIntegrationTest> {
  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  private final Provider<ServerPort> serverPortProvider;

  private final Provider<SearchDetailsViewModelDelegateImpl> searchDetailsViewModelDelegateProvider;

  public SearchDetailsIntegrationTest_MembersInjector(
      Provider<CoroutineDispatcher> coroutineDispatcherProvider,
      Provider<ServerPort> serverPortProvider,
      Provider<SearchDetailsViewModelDelegateImpl> searchDetailsViewModelDelegateProvider) {
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
    this.serverPortProvider = serverPortProvider;
    this.searchDetailsViewModelDelegateProvider = searchDetailsViewModelDelegateProvider;
  }

  public static MembersInjector<SearchDetailsIntegrationTest> create(
      Provider<CoroutineDispatcher> coroutineDispatcherProvider,
      Provider<ServerPort> serverPortProvider,
      Provider<SearchDetailsViewModelDelegateImpl> searchDetailsViewModelDelegateProvider) {
    return new SearchDetailsIntegrationTest_MembersInjector(coroutineDispatcherProvider, serverPortProvider, searchDetailsViewModelDelegateProvider);
  }

  @Override
  public void injectMembers(SearchDetailsIntegrationTest instance) {
    BaseTest_MembersInjector.injectCoroutineDispatcher(instance, coroutineDispatcherProvider.get());
    BaseTest_MembersInjector.injectServerPort(instance, serverPortProvider.get());
    injectSearchDetailsViewModelDelegate(instance, searchDetailsViewModelDelegateProvider.get());
  }

  @InjectedFieldSignature("com.karthyks.dice.searchdetails.SearchDetailsIntegrationTest.searchDetailsViewModelDelegate")
  public static void injectSearchDetailsViewModelDelegate(SearchDetailsIntegrationTest instance,
      SearchDetailsViewModelDelegateImpl searchDetailsViewModelDelegate) {
    instance.searchDetailsViewModelDelegate = searchDetailsViewModelDelegate;
  }
}
