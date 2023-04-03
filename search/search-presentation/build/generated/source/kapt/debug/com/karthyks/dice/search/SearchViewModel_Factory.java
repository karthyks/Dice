package com.karthyks.dice.search;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<SearchViewModelDelegateImpl> searchViewModelDelegateProvider;

  public SearchViewModel_Factory(
      Provider<SearchViewModelDelegateImpl> searchViewModelDelegateProvider) {
    this.searchViewModelDelegateProvider = searchViewModelDelegateProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(searchViewModelDelegateProvider.get());
  }

  public static SearchViewModel_Factory create(
      Provider<SearchViewModelDelegateImpl> searchViewModelDelegateProvider) {
    return new SearchViewModel_Factory(searchViewModelDelegateProvider);
  }

  public static SearchViewModel newInstance(SearchViewModelDelegateImpl searchViewModelDelegate) {
    return new SearchViewModel(searchViewModelDelegate);
  }
}
