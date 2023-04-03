package com.karthyks.dice.search.di;

import android.content.Context;
import com.karthyks.dice.search.resource.ArtistStringProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("dagger.Reusable")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ArtistStringProviderDIModule_ProvideArtistStringProviderFactory implements Factory<ArtistStringProvider> {
  private final Provider<Context> contextProvider;

  public ArtistStringProviderDIModule_ProvideArtistStringProviderFactory(
      Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ArtistStringProvider get() {
    return provideArtistStringProvider(contextProvider.get());
  }

  public static ArtistStringProviderDIModule_ProvideArtistStringProviderFactory create(
      Provider<Context> contextProvider) {
    return new ArtistStringProviderDIModule_ProvideArtistStringProviderFactory(contextProvider);
  }

  public static ArtistStringProvider provideArtistStringProvider(Context context) {
    return Preconditions.checkNotNullFromProvides(ArtistStringProviderDIModule.INSTANCE.provideArtistStringProvider(context));
  }
}
