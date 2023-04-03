package com.karthyks.dice.search.pager.di;

import com.karthyks.dice.search.pager.DataSourceFactory;
import com.karthyks.dice.search.repository.SearchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("dagger.Reusable")
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
public final class DataSourceDIModule_ProvideDataSourceFactoryFactory implements Factory<DataSourceFactory> {
  private final Provider<SearchRepository> searchRepositoryProvider;

  public DataSourceDIModule_ProvideDataSourceFactoryFactory(
      Provider<SearchRepository> searchRepositoryProvider) {
    this.searchRepositoryProvider = searchRepositoryProvider;
  }

  @Override
  public DataSourceFactory get() {
    return provideDataSourceFactory(searchRepositoryProvider.get());
  }

  public static DataSourceDIModule_ProvideDataSourceFactoryFactory create(
      Provider<SearchRepository> searchRepositoryProvider) {
    return new DataSourceDIModule_ProvideDataSourceFactoryFactory(searchRepositoryProvider);
  }

  public static DataSourceFactory provideDataSourceFactory(SearchRepository searchRepository) {
    return Preconditions.checkNotNullFromProvides(DataSourceDIModule.INSTANCE.provideDataSourceFactory(searchRepository));
  }
}
