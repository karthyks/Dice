package com.karthyks.dice.search.repository;

import com.karthyks.dice.search.mapper.SearchMapper;
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
public final class SearchRepositoryModule_ProvideSearchRepositoryFactory implements Factory<SearchRepository> {
  private final Provider<CoroutineDispatcher> dispatcherProvider;

  private final Provider<MusicBrainzService> musicBrainzServiceProvider;

  private final Provider<SearchMapper> searchMapperProvider;

  public SearchRepositoryModule_ProvideSearchRepositoryFactory(
      Provider<CoroutineDispatcher> dispatcherProvider,
      Provider<MusicBrainzService> musicBrainzServiceProvider,
      Provider<SearchMapper> searchMapperProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.musicBrainzServiceProvider = musicBrainzServiceProvider;
    this.searchMapperProvider = searchMapperProvider;
  }

  @Override
  public SearchRepository get() {
    return provideSearchRepository(dispatcherProvider.get(), musicBrainzServiceProvider.get(), searchMapperProvider.get());
  }

  public static SearchRepositoryModule_ProvideSearchRepositoryFactory create(
      Provider<CoroutineDispatcher> dispatcherProvider,
      Provider<MusicBrainzService> musicBrainzServiceProvider,
      Provider<SearchMapper> searchMapperProvider) {
    return new SearchRepositoryModule_ProvideSearchRepositoryFactory(dispatcherProvider, musicBrainzServiceProvider, searchMapperProvider);
  }

  public static SearchRepository provideSearchRepository(CoroutineDispatcher dispatcher,
      MusicBrainzService musicBrainzService, SearchMapper searchMapper) {
    return Preconditions.checkNotNullFromProvides(SearchRepositoryModule.INSTANCE.provideSearchRepository(dispatcher, musicBrainzService, searchMapper));
  }
}
