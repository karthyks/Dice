package com.karthyks.dice.testframework.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.test.TestCoroutineScheduler;

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
public final class TestCoroutinesModule_ProvideTestSchedulerFactory implements Factory<TestCoroutineScheduler> {
  @Override
  public TestCoroutineScheduler get() {
    return provideTestScheduler();
  }

  public static TestCoroutinesModule_ProvideTestSchedulerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TestCoroutineScheduler provideTestScheduler() {
    return Preconditions.checkNotNullFromProvides(TestCoroutinesModule.INSTANCE.provideTestScheduler());
  }

  private static final class InstanceHolder {
    private static final TestCoroutinesModule_ProvideTestSchedulerFactory INSTANCE = new TestCoroutinesModule_ProvideTestSchedulerFactory();
  }
}
