package com.karthyks.dice.coroutines;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.karthyks.dice.coroutines.annotation.Immediate")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutinesDIModule_ProvideImmediateCoroutineDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideImmediateCoroutineDispatcher();
  }

  public static CoroutinesDIModule_ProvideImmediateCoroutineDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideImmediateCoroutineDispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutinesDIModule.INSTANCE.provideImmediateCoroutineDispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutinesDIModule_ProvideImmediateCoroutineDispatcherFactory INSTANCE = new CoroutinesDIModule_ProvideImmediateCoroutineDispatcherFactory();
  }
}
