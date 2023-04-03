package com.karthyks.dice.searchdetails.di;

import com.karthyks.dice.searchdetails.mapper.ArtistStateMapper;
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
public final class ArtistStateMapperModule_ProvideArtistStateMapperFactory implements Factory<ArtistStateMapper> {
  @Override
  public ArtistStateMapper get() {
    return provideArtistStateMapper();
  }

  public static ArtistStateMapperModule_ProvideArtistStateMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ArtistStateMapper provideArtistStateMapper() {
    return Preconditions.checkNotNullFromProvides(ArtistStateMapperModule.INSTANCE.provideArtistStateMapper());
  }

  private static final class InstanceHolder {
    private static final ArtistStateMapperModule_ProvideArtistStateMapperFactory INSTANCE = new ArtistStateMapperModule_ProvideArtistStateMapperFactory();
  }
}
