package com.karthyks.dice.search.mapper;

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
public final class SearchMapperModule_ProvideSearchMapperFactory implements Factory<SearchMapper> {
  @Override
  public SearchMapper get() {
    return provideSearchMapper();
  }

  public static SearchMapperModule_ProvideSearchMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SearchMapper provideSearchMapper() {
    return Preconditions.checkNotNullFromProvides(SearchMapperModule.INSTANCE.provideSearchMapper());
  }

  private static final class InstanceHolder {
    private static final SearchMapperModule_ProvideSearchMapperFactory INSTANCE = new SearchMapperModule_ProvideSearchMapperFactory();
  }
}
