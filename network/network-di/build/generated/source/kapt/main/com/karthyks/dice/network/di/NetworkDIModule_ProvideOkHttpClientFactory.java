package com.karthyks.dice.network.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

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
public final class NetworkDIModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideOkHttpClient();
  }

  public static NetworkDIModule_ProvideOkHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideOkHttpClient() {
    return Preconditions.checkNotNullFromProvides(NetworkDIModule.INSTANCE.provideOkHttpClient());
  }

  private static final class InstanceHolder {
    private static final NetworkDIModule_ProvideOkHttpClientFactory INSTANCE = new NetworkDIModule_ProvideOkHttpClientFactory();
  }
}
