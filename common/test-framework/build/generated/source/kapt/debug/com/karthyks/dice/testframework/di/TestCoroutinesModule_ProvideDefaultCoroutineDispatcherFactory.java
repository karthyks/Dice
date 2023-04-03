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
    "com.karthyks.dice.coroutines.annotation.Default",
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
public final class TestCoroutinesModule_ProvideDefaultCoroutineDispatcherFactory implements Factory<CoroutineDispatcher> {
  private final Provider<CoroutineDispatcher> testDispatcherProvider;

  public TestCoroutinesModule_ProvideDefaultCoroutineDispatcherFactory(
      Provider<CoroutineDispatcher> testDispatcherProvider) {
    this.testDispatcherProvider = testDispatcherProvider;
  }

  @Override
  public CoroutineDispatcher get() {
    return provideDefaultCoroutineDispatcher(testDispatcherProvider.get());
  }

  public static TestCoroutinesModule_ProvideDefaultCoroutineDispatcherFactory create(
      Provider<CoroutineDispatcher> testDispatcherProvider) {
    return new TestCoroutinesModule_ProvideDefaultCoroutineDispatcherFactory(testDispatcherProvider);
  }

  public static CoroutineDispatcher provideDefaultCoroutineDispatcher(
      CoroutineDispatcher testDispatcher) {
    return Preconditions.checkNotNullFromProvides(TestCoroutinesModule.INSTANCE.provideDefaultCoroutineDispatcher(testDispatcher));
  }
}
