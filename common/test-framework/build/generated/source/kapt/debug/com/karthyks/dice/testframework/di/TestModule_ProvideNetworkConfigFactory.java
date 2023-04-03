package com.karthyks.dice.testframework.di;

import com.karthyks.dice.network.config.NetworkConfig;
import com.karthyks.dice.testframework.ServerPort;
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
public final class TestModule_ProvideNetworkConfigFactory implements Factory<NetworkConfig> {
  private final Provider<ServerPort> serverPortProvider;

  public TestModule_ProvideNetworkConfigFactory(Provider<ServerPort> serverPortProvider) {
    this.serverPortProvider = serverPortProvider;
  }

  @Override
  public NetworkConfig get() {
    return provideNetworkConfig(serverPortProvider.get());
  }

  public static TestModule_ProvideNetworkConfigFactory create(
      Provider<ServerPort> serverPortProvider) {
    return new TestModule_ProvideNetworkConfigFactory(serverPortProvider);
  }

  public static NetworkConfig provideNetworkConfig(ServerPort serverPort) {
    return Preconditions.checkNotNullFromProvides(TestModule.INSTANCE.provideNetworkConfig(serverPort));
  }
}
