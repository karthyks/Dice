package com.karthyks.dice.searchdetails.repository;

import com.karthyks.dice.searchdetails.mapper.SearchDetailsMapper;
import com.karthyks.dice.service.musicbrainz.MusicBrainzService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("dagger.Reusable")
@QualifierMetadata("com.karthyks.dice.coroutines.annotation.IO")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchDetailsRepositoryProviderModule_ProvideSearchDetailsRepositoryFactory implements Factory<SearchDetailsRepository> {
  private final Provider<CoroutineDispatcher> dispatcherProvider;

  private final Provider<MusicBrainzService> musicBrainzServiceProvider;

  private final Provider<SearchDetailsMapper> searchDetailsMapperProvider;

  public SearchDetailsRepositoryProviderModule_ProvideSearchDetailsRepositoryFactory(
      Provider<CoroutineDispatcher> dispatcherProvider,
      Provider<MusicBrainzService> musicBrainzServiceProvider,
      Provider<SearchDetailsMapper> searchDetailsMapperProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.musicBrainzServiceProvider = musicBrainzServiceProvider;
    this.searchDetailsMapperProvider = searchDetailsMapperProvider;
  }

  @Override
  public SearchDetailsRepository get() {
    return provideSearchDetailsRepository(dispatcherProvider.get(), musicBrainzServiceProvider.get(), searchDetailsMapperProvider.get());
  }

  public static SearchDetailsRepositoryProviderModule_ProvideSearchDetailsRepositoryFactory create(
      Provider<CoroutineDispatcher> dispatcherProvider,
      Provider<MusicBrainzService> musicBrainzServiceProvider,
      Provider<SearchDetailsMapper> searchDetailsMapperProvider) {
    return new SearchDetailsRepositoryProviderModule_ProvideSearchDetailsRepositoryFactory(dispatcherProvider, musicBrainzServiceProvider, searchDetailsMapperProvider);
  }

  public static SearchDetailsRepository provideSearchDetailsRepository(
      CoroutineDispatcher dispatcher, MusicBrainzService musicBrainzService,
      SearchDetailsMapper searchDetailsMapper) {
    return Preconditions.checkNotNullFromProvides(SearchDetailsRepositoryProviderModule.INSTANCE.provideSearchDetailsRepository(dispatcher, musicBrainzService, searchDetailsMapper));
  }
}
