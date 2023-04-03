package com.karthyks.dice.network.di;

import com.karthyks.dice.network.endpoint.MusicBrainzEndpoint;
import com.karthyks.dice.network.helper.SafeApiCaller;
import com.karthyks.dice.service.musicbrainz.MusicBrainzService;
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
public final class MusicBrainzServiceDIModule_ProvideMusicBrainzServiceFactory implements Factory<MusicBrainzService> {
  private final Provider<MusicBrainzEndpoint> musicBrainzEndpointProvider;

  private final Provider<SafeApiCaller> safeApiCallerProvider;

  public MusicBrainzServiceDIModule_ProvideMusicBrainzServiceFactory(
      Provider<MusicBrainzEndpoint> musicBrainzEndpointProvider,
      Provider<SafeApiCaller> safeApiCallerProvider) {
    this.musicBrainzEndpointProvider = musicBrainzEndpointProvider;
    this.safeApiCallerProvider = safeApiCallerProvider;
  }

  @Override
  public MusicBrainzService get() {
    return provideMusicBrainzService(musicBrainzEndpointProvider.get(), safeApiCallerProvider.get());
  }

  public static MusicBrainzServiceDIModule_ProvideMusicBrainzServiceFactory create(
      Provider<MusicBrainzEndpoint> musicBrainzEndpointProvider,
      Provider<SafeApiCaller> safeApiCallerProvider) {
    return new MusicBrainzServiceDIModule_ProvideMusicBrainzServiceFactory(musicBrainzEndpointProvider, safeApiCallerProvider);
  }

  public static MusicBrainzService provideMusicBrainzService(
      MusicBrainzEndpoint musicBrainzEndpoint, SafeApiCaller safeApiCaller) {
    return Preconditions.checkNotNullFromProvides(MusicBrainzServiceDIModule.INSTANCE.provideMusicBrainzService(musicBrainzEndpoint, safeApiCaller));
  }
}
