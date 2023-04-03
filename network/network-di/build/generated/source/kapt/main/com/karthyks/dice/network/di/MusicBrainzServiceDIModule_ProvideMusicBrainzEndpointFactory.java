package com.karthyks.dice.network.di;

import com.karthyks.dice.network.endpoint.MusicBrainzEndpoint;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class MusicBrainzServiceDIModule_ProvideMusicBrainzEndpointFactory implements Factory<MusicBrainzEndpoint> {
  private final Provider<Retrofit> retrofitProvider;

  public MusicBrainzServiceDIModule_ProvideMusicBrainzEndpointFactory(
      Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MusicBrainzEndpoint get() {
    return provideMusicBrainzEndpoint(retrofitProvider.get());
  }

  public static MusicBrainzServiceDIModule_ProvideMusicBrainzEndpointFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new MusicBrainzServiceDIModule_ProvideMusicBrainzEndpointFactory(retrofitProvider);
  }

  public static MusicBrainzEndpoint provideMusicBrainzEndpoint(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(MusicBrainzServiceDIModule.INSTANCE.provideMusicBrainzEndpoint(retrofit));
  }
}
