package com.karthyks.dice.searchdetails;

import com.karthyks.dice.searchdetails.mapper.ArtistStateMapper;
import com.karthyks.dice.searchdetails.repository.SearchDetailsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.karthyks.dice.coroutines.annotation.Main")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchDetailsViewModelDelegateImpl_Factory implements Factory<SearchDetailsViewModelDelegateImpl> {
  private final Provider<CoroutineDispatcher> dispatcherProvider;

  private final Provider<SearchDetailsRepository> searchDetailsRepositoryProvider;

  private final Provider<ArtistStateMapper> artistStateMapperProvider;

  public SearchDetailsViewModelDelegateImpl_Factory(
      Provider<CoroutineDispatcher> dispatcherProvider,
      Provider<SearchDetailsRepository> searchDetailsRepositoryProvider,
      Provider<ArtistStateMapper> artistStateMapperProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.searchDetailsRepositoryProvider = searchDetailsRepositoryProvider;
    this.artistStateMapperProvider = artistStateMapperProvider;
  }

  @Override
  public SearchDetailsViewModelDelegateImpl get() {
    return newInstance(dispatcherProvider.get(), searchDetailsRepositoryProvider.get(), artistStateMapperProvider.get());
  }

  public static SearchDetailsViewModelDelegateImpl_Factory create(
      Provider<CoroutineDispatcher> dispatcherProvider,
      Provider<SearchDetailsRepository> searchDetailsRepositoryProvider,
      Provider<ArtistStateMapper> artistStateMapperProvider) {
    return new SearchDetailsViewModelDelegateImpl_Factory(dispatcherProvider, searchDetailsRepositoryProvider, artistStateMapperProvider);
  }

  public static SearchDetailsViewModelDelegateImpl newInstance(CoroutineDispatcher dispatcher,
      SearchDetailsRepository searchDetailsRepository, ArtistStateMapper artistStateMapper) {
    return new SearchDetailsViewModelDelegateImpl(dispatcher, searchDetailsRepository, artistStateMapper);
  }
}
