package com.karthyks.dice.testframework.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.test.TestCoroutineScheduler;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.karthyks.dice.coroutines.annotation.Test")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TestCoroutinesModule_ProvideTestDispatcherFactory implements Factory<CoroutineDispatcher> {
  private final Provider<TestCoroutineScheduler> testSchedulerProvider;

  public TestCoroutinesModule_ProvideTestDispatcherFactory(
      Provider<TestCoroutineScheduler> testSchedulerProvider) {
    this.testSchedulerProvider = testSchedulerProvider;
  }

  @Override
  public CoroutineDispatcher get() {
    return provideTestDispatcher(testSchedulerProvider.get());
  }

  public static TestCoroutinesModule_ProvideTestDispatcherFactory create(
      Provider<TestCoroutineScheduler> testSchedulerProvider) {
    return new TestCoroutinesModule_ProvideTestDispatcherFactory(testSchedulerProvider);
  }

  public static CoroutineDispatcher provideTestDispatcher(TestCoroutineScheduler testScheduler) {
    return Preconditions.checkNotNullFromProvides(TestCoroutinesModule.INSTANCE.provideTestDispatcher(testScheduler));
  }
}
