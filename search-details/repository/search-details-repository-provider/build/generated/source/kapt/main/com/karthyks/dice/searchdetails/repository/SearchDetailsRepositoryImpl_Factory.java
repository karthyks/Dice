package com.karthyks.dice.searchdetails.repository;

import com.karthyks.dice.searchdetails.mapper.SearchDetailsMapper;
import com.karthyks.dice.service.musicbrainz.MusicBrainzService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
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
public final class SearchDetailsRepositoryImpl_Factory implements Factory<SearchDetailsRepositoryImpl> {
  private final Provider<CoroutineDispatcher> dispatcherProvider;

  private final Provider<MusicBrainzService> musicBrainzServiceProvider;

  private final Provider<SearchDetailsMapper> searchDetailsMapperProvider;

  public SearchDetailsRepositoryImpl_Factory(Provider<CoroutineDispatcher> dispatcherProvider,
      Provider<MusicBrainzService> musicBrainzServiceProvider,
      Provider<SearchDetailsMapper> searchDetailsMapperProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.musicBrainzServiceProvider = musicBrainzServiceProvider;
    this.searchDetailsMapperProvider = searchDetailsMapperProvider;
  }

  @Override
  public SearchDetailsRepositoryImpl get() {
    return newInstance(dispatcherProvider.get(), musicBrainzServiceProvider.get(), searchDetailsMapperProvider.get());
  }

  public static SearchDetailsRepositoryImpl_Factory create(
      Provider<CoroutineDispatcher> dispatcherProvider,
      Provider<MusicBrainzService> musicBrainzServiceProvider,
      Provider<SearchDetailsMapper> searchDetailsMapperProvider) {
    return new SearchDetailsRepositoryImpl_Factory(dispatcherProvider, musicBrainzServiceProvider, searchDetailsMapperProvider);
  }

  public static SearchDetailsRepositoryImpl newInstance(CoroutineDispatcher dispatcher,
      MusicBrainzService musicBrainzService, SearchDetailsMapper searchDetailsMapper) {
    return new SearchDetailsRepositoryImpl(dispatcher, musicBrainzService, searchDetailsMapper);
  }
}
