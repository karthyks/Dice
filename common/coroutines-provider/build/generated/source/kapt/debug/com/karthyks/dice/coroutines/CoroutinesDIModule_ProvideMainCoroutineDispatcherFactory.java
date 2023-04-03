package com.karthyks.dice.coroutines;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.karthyks.dice.coroutines.annotation.Main")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutinesDIModule_ProvideMainCoroutineDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideMainCoroutineDispatcher();
  }

  public static CoroutinesDIModule_ProvideMainCoroutineDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideMainCoroutineDispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutinesDIModule.INSTANCE.provideMainCoroutineDispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutinesDIModule_ProvideMainCoroutineDispatcherFactory INSTANCE = new CoroutinesDIModule_ProvideMainCoroutineDispatcherFactory();
  }
}
