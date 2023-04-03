package com.karthyks.dice.testframework;

import com.karthyks.dice.coroutines.annotation.Test;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

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
public final class BaseTest_MembersInjector implements MembersInjector<BaseTest> {
  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  private final Provider<ServerPort> serverPortProvider;

  public BaseTest_MembersInjector(Provider<CoroutineDispatcher> coroutineDispatcherProvider,
      Provider<ServerPort> serverPortProvider) {
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
    this.serverPortProvider = serverPortProvider;
  }

  public static MembersInjector<BaseTest> create(
      Provider<CoroutineDispatcher> coroutineDispatcherProvider,
      Provider<ServerPort> serverPortProvider) {
    return new BaseTest_MembersInjector(coroutineDispatcherProvider, serverPortProvider);
  }

  @Override
  public void injectMembers(BaseTest instance) {
    injectCoroutineDispatcher(instance, coroutineDispatcherProvider.get());
    injectServerPort(instance, serverPortProvider.get());
  }

  @InjectedFieldSignature("com.karthyks.dice.testframework.BaseTest.coroutineDispatcher")
  @Test
  public static void injectCoroutineDispatcher(BaseTest instance,
      CoroutineDispatcher coroutineDispatcher) {
    instance.coroutineDispatcher = coroutineDispatcher;
  }

  @InjectedFieldSignature("com.karthyks.dice.testframework.BaseTest.serverPort")
  public static void injectServerPort(BaseTest instance, ServerPort serverPort) {
    instance.serverPort = serverPort;
  }
}
