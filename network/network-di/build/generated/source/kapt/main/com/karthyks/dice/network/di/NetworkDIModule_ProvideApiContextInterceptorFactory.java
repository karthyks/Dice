package com.karthyks.dice.network.di;

import com.karthyks.dice.network.config.NetworkConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;

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
public final class NetworkDIModule_ProvideApiContextInterceptorFactory implements Factory<Interceptor> {
  private final Provider<NetworkConfig> networkConfigProvider;

  public NetworkDIModule_ProvideApiContextInterceptorFactory(
      Provider<NetworkConfig> networkConfigProvider) {
    this.networkConfigProvider = networkConfigProvider;
  }

  @Override
  public Interceptor get() {
    return provideApiContextInterceptor(networkConfigProvider.get());
  }

  public static NetworkDIModule_ProvideApiContextInterceptorFactory create(
      Provider<NetworkConfig> networkConfigProvider) {
    return new NetworkDIModule_ProvideApiContextInterceptorFactory(networkConfigProvider);
  }

  public static Interceptor provideApiContextInterceptor(NetworkConfig networkConfig) {
    return Preconditions.checkNotNullFromProvides(NetworkDIModule.INSTANCE.provideApiContextInterceptor(networkConfig));
  }
}
