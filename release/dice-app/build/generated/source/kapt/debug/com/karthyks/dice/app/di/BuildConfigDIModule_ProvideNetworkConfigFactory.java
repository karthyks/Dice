package com.karthyks.dice.app.di;

import com.karthyks.dice.network.config.NetworkConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class BuildConfigDIModule_ProvideNetworkConfigFactory implements Factory<NetworkConfig> {
  @Override
  public NetworkConfig get() {
    return provideNetworkConfig();
  }

  public static BuildConfigDIModule_ProvideNetworkConfigFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NetworkConfig provideNetworkConfig() {
    return Preconditions.checkNotNullFromProvides(BuildConfigDIModule.INSTANCE.provideNetworkConfig());
  }

  private static final class InstanceHolder {
    private static final BuildConfigDIModule_ProvideNetworkConfigFactory INSTANCE = new BuildConfigDIModule_ProvideNetworkConfigFactory();
  }
}
