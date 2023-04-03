package com.karthyks.dice.testframework.di;

import com.karthyks.dice.testframework.ServerPort;
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
public final class TestModule_ProvideServerPortFactory implements Factory<ServerPort> {
  @Override
  public ServerPort get() {
    return provideServerPort();
  }

  public static TestModule_ProvideServerPortFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ServerPort provideServerPort() {
    return Preconditions.checkNotNullFromProvides(TestModule.INSTANCE.provideServerPort());
  }

  private static final class InstanceHolder {
    private static final TestModule_ProvideServerPortFactory INSTANCE = new TestModule_ProvideServerPortFactory();
  }
}
