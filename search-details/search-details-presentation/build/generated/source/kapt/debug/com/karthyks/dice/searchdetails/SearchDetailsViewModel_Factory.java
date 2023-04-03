package com.karthyks.dice.searchdetails;

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
public final class SearchDetailsViewModel_Factory implements Factory<SearchDetailsViewModel> {
  private final Provider<SearchDetailsViewModelDelegateImpl> searchDetailsViewModelDelegateProvider;

  public SearchDetailsViewModel_Factory(
      Provider<SearchDetailsViewModelDelegateImpl> searchDetailsViewModelDelegateProvider) {
    this.searchDetailsViewModelDelegateProvider = searchDetailsViewModelDelegateProvider;
  }

  @Override
  public SearchDetailsViewModel get() {
    return newInstance(searchDetailsViewModelDelegateProvider.get());
  }

  public static SearchDetailsViewModel_Factory create(
      Provider<SearchDetailsViewModelDelegateImpl> searchDetailsViewModelDelegateProvider) {
    return new SearchDetailsViewModel_Factory(searchDetailsViewModelDelegateProvider);
  }

  public static SearchDetailsViewModel newInstance(
      SearchDetailsViewModelDelegateImpl searchDetailsViewModelDelegate) {
    return new SearchDetailsViewModel(searchDetailsViewModelDelegate);
  }
}
