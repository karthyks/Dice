package com.karthyks.dice.search;

import com.karthyks.dice.search.mapper.ArtistMapper;
import com.karthyks.dice.search.pager.DataSourceFactory;
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
public final class SearchViewModelDelegateImpl_Factory implements Factory<SearchViewModelDelegateImpl> {
  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  private final Provider<DataSourceFactory> dataSourceFactoryProvider;

  private final Provider<ArtistMapper> artistMapperProvider;

  public SearchViewModelDelegateImpl_Factory(
      Provider<CoroutineDispatcher> coroutineDispatcherProvider,
      Provider<DataSourceFactory> dataSourceFactoryProvider,
      Provider<ArtistMapper> artistMapperProvider) {
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
    this.dataSourceFactoryProvider = dataSourceFactoryProvider;
    this.artistMapperProvider = artistMapperProvider;
  }

  @Override
  public SearchViewModelDelegateImpl get() {
    return newInstance(coroutineDispatcherProvider.get(), dataSourceFactoryProvider.get(), artistMapperProvider.get());
  }

  public static SearchViewModelDelegateImpl_Factory create(
      Provider<CoroutineDispatcher> coroutineDispatcherProvider,
      Provider<DataSourceFactory> dataSourceFactoryProvider,
      Provider<ArtistMapper> artistMapperProvider) {
    return new SearchViewModelDelegateImpl_Factory(coroutineDispatcherProvider, dataSourceFactoryProvider, artistMapperProvider);
  }

  public static SearchViewModelDelegateImpl newInstance(CoroutineDispatcher coroutineDispatcher,
      DataSourceFactory dataSourceFactory, ArtistMapper artistMapper) {
    return new SearchViewModelDelegateImpl(coroutineDispatcher, dataSourceFactory, artistMapper);
  }
}
