package com.karthyks.dice.coroutines;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.karthyks.dice.coroutines.annotation.IO")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutinesDIModule_ProvideIOCoroutineDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideIOCoroutineDispatcher();
  }

  public static CoroutinesDIModule_ProvideIOCoroutineDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideIOCoroutineDispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutinesDIModule.INSTANCE.provideIOCoroutineDispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutinesDIModule_ProvideIOCoroutineDispatcherFactory INSTANCE = new CoroutinesDIModule_ProvideIOCoroutineDispatcherFactory();
  }
}
