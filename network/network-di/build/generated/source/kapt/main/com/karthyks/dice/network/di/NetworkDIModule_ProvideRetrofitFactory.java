package com.karthyks.dice.network.di;

import com.karthyks.dice.network.config.NetworkConfig;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class NetworkDIModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<NetworkConfig> networkConfigProvider;

  private final Provider<Set<Interceptor>> interceptorsProvider;

  private final Provider<Moshi> moshiProvider;

  public NetworkDIModule_ProvideRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<NetworkConfig> networkConfigProvider,
      Provider<Set<Interceptor>> interceptorsProvider, Provider<Moshi> moshiProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.networkConfigProvider = networkConfigProvider;
    this.interceptorsProvider = interceptorsProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(okHttpClientProvider.get(), networkConfigProvider.get(), interceptorsProvider.get(), moshiProvider.get());
  }

  public static NetworkDIModule_ProvideRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider, Provider<NetworkConfig> networkConfigProvider,
      Provider<Set<Interceptor>> interceptorsProvider, Provider<Moshi> moshiProvider) {
    return new NetworkDIModule_ProvideRetrofitFactory(okHttpClientProvider, networkConfigProvider, interceptorsProvider, moshiProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient okHttpClient, NetworkConfig networkConfig,
      Set<Interceptor> interceptors, Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(NetworkDIModule.INSTANCE.provideRetrofit(okHttpClient, networkConfig, interceptors, moshi));
  }
}
