package com.karthyks.dice.search.di;

import com.karthyks.dice.search.mapper.ArtistMapper;
import com.karthyks.dice.search.resource.ArtistStringProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ArtistMapperModule_ProvideArtistMapperFactory implements Factory<ArtistMapper> {
  private final Provider<ArtistStringProvider> artistStringProvider;

  public ArtistMapperModule_ProvideArtistMapperFactory(
      Provider<ArtistStringProvider> artistStringProvider) {
    this.artistStringProvider = artistStringProvider;
  }

  @Override
  public ArtistMapper get() {
    return provideArtistMapper(artistStringProvider.get());
  }

  public static ArtistMapperModule_ProvideArtistMapperFactory create(
      Provider<ArtistStringProvider> artistStringProvider) {
    return new ArtistMapperModule_ProvideArtistMapperFactory(artistStringProvider);
  }

  public static ArtistMapper provideArtistMapper(ArtistStringProvider artistStringProvider) {
    return Preconditions.checkNotNullFromProvides(ArtistMapperModule.INSTANCE.provideArtistMapper(artistStringProvider));
  }
}
