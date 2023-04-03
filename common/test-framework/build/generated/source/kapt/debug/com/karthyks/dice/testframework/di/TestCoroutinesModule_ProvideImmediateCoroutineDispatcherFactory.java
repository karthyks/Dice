package com.karthyks.dice.testframework.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({
    "com.karthyks.dice.coroutines.annotation.Immediate",
    "com.karthyks.dice.coroutines.annotation.Test"
})
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TestCoroutinesModule_ProvideImmediateCoroutineDispatcherFactory implements Factory<CoroutineDispatcher> {
  private final Provider<CoroutineDispatcher> testDispatcherProvider;

  public TestCoroutinesModule_ProvideImmediateCoroutineDispatcherFactory(
      Provider<CoroutineDispatcher> testDispatcherProvider) {
    this.testDispatcherProvider = testDispatcherProvider;
  }

  @Override
  public CoroutineDispatcher get() {
    return provideImmediateCoroutineDispatcher(testDispatcherProvider.get());
  }

  public static TestCoroutinesModule_ProvideImmediateCoroutineDispatcherFactory create(
      Provider<CoroutineDispatcher> testDispatcherProvider) {
    return new TestCoroutinesModule_ProvideImmediateCoroutineDispatcherFactory(testDispatcherProvider);
  }

  public static CoroutineDispatcher provideImmediateCoroutineDispatcher(
      CoroutineDispatcher testDispatcher) {
    return Preconditions.checkNotNullFromProvides(TestCoroutinesModule.INSTANCE.provideImmediateCoroutineDispatcher(testDispatcher));
  }
}
