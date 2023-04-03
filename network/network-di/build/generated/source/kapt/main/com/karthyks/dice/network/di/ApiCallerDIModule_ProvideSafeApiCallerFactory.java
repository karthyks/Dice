package com.karthyks.dice.network.di;

import com.karthyks.dice.network.helper.SafeApiCaller;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ApiCallerDIModule_ProvideSafeApiCallerFactory implements Factory<SafeApiCaller> {
  private final Provider<Moshi> moshiProvider;

  public ApiCallerDIModule_ProvideSafeApiCallerFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public SafeApiCaller get() {
    return provideSafeApiCaller(moshiProvider.get());
  }

  public static ApiCallerDIModule_ProvideSafeApiCallerFactory create(
      Provider<Moshi> moshiProvider) {
    return new ApiCallerDIModule_ProvideSafeApiCallerFactory(moshiProvider);
  }

  public static SafeApiCaller provideSafeApiCaller(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(ApiCallerDIModule.INSTANCE.provideSafeApiCaller(moshi));
  }
}
