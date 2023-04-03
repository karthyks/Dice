package com.karthyks.dice.coroutines;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.karthyks.dice.coroutines.annotation.Default")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutinesDIModule_ProvideDefaultCoroutineDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideDefaultCoroutineDispatcher();
  }

  public static CoroutinesDIModule_ProvideDefaultCoroutineDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideDefaultCoroutineDispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutinesDIModule.INSTANCE.provideDefaultCoroutineDispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutinesDIModule_ProvideDefaultCoroutineDispatcherFactory INSTANCE = new CoroutinesDIModule_ProvideDefaultCoroutineDispatcherFactory();
  }
}
