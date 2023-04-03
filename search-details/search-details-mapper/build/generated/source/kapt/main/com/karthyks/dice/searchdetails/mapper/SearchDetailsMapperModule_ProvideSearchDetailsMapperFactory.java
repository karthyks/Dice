package com.karthyks.dice.searchdetails.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class SearchDetailsMapperModule_ProvideSearchDetailsMapperFactory implements Factory<SearchDetailsMapper> {
  @Override
  public SearchDetailsMapper get() {
    return provideSearchDetailsMapper();
  }

  public static SearchDetailsMapperModule_ProvideSearchDetailsMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SearchDetailsMapper provideSearchDetailsMapper() {
    return Preconditions.checkNotNullFromProvides(SearchDetailsMapperModule.INSTANCE.provideSearchDetailsMapper());
  }

  private static final class InstanceHolder {
    private static final SearchDetailsMapperModule_ProvideSearchDetailsMapperFactory INSTANCE = new SearchDetailsMapperModule_ProvideSearchDetailsMapperFactory();
  }
}
