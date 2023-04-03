package com.karthyks.dice.testframework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020 H\u0007J%\u0010\"\u001a\u00060 j\u0002`#2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020 0%\u00a2\u0006\u0002\b\'H\u0002J^\u0010(\u001a\u00020 \"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010**\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H)0,2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H*0%\u00a2\u0006\u0002\b\'2\u0006\u0010.\u001a\u0002H*2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202\u00a2\u0006\u0002\u00103Jj\u0010(\u001a\u00020 \"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010**\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H)0,2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H*0%\u00a2\u0006\u0002\b\'2\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002060%\u00a2\u0006\u0002\b\'2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202Jb\u0010(\u001a\u00020 \"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010**\b\u0012\u0004\u0012\u0002H)0,2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H*0%\u00a2\u0006\u0002\b\'2\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002060%\u00a2\u0006\u0002\b\'2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202JK\u00107\u001a\u00020 \"\u0004\b\u0000\u0010)*\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H)0,2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002060%\u00a2\u0006\u0002\b\'JC\u00107\u001a\u00020 \"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u0002H)0,2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002060%\u00a2\u0006\u0002\b\'R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8GX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00068"}, d2 = {"Lcom/karthyks/dice/testframework/BaseTest;", "", "()V", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineDispatcher$annotations", "getCoroutineDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setCoroutineDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "hiltRule$delegate", "Lkotlin/Lazy;", "mockServer", "Lcom/karthyks/dice/test/httpclient/MockServer;", "getMockServer", "()Lcom/karthyks/dice/test/httpclient/MockServer;", "mockServer$delegate", "serverPort", "Lcom/karthyks/dice/testframework/ServerPort;", "getServerPort", "()Lcom/karthyks/dice/testframework/ServerPort;", "setServerPort", "(Lcom/karthyks/dice/testframework/ServerPort;)V", "testDispatcher", "Lkotlinx/coroutines/test/TestDispatcher;", "getTestDispatcher", "()Lkotlinx/coroutines/test/TestDispatcher;", "start", "", "stop", "testRun", "Lkotlinx/coroutines/test/TestResult;", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ExtensionFunctionType;", "assertItem", "T", "R", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "propertyToAssert", "equalsTo", "errorMessage", "", "timeOutMs", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/String;J)V", "onProperty", "predicate", "", "waitForState", "test-framework_debug"})
@org.robolectric.annotation.LooperMode(value = org.robolectric.annotation.LooperMode.Mode.PAUSED)
@org.junit.runner.RunWith(value = org.robolectric.RobolectricTestRunner.class)
@org.robolectric.annotation.Config(application = dagger.hilt.android.testing.HiltTestApplication.class)
public class BaseTest {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy hiltRule$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mockServer$delegate = null;
    @javax.inject.Inject()
    public kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
    @javax.inject.Inject()
    public com.karthyks.dice.testframework.ServerPort serverPort;
    
    public BaseTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.karthyks.dice.test.httpclient.MockServer getMockServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getCoroutineDispatcher() {
        return null;
    }
    
    @com.karthyks.dice.coroutines.annotation.Test()
    @java.lang.Deprecated()
    public static void getCoroutineDispatcher$annotations() {
    }
    
    public final void setCoroutineDispatcher(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.karthyks.dice.testframework.ServerPort getServerPort() {
        return null;
    }
    
    public final void setServerPort(@org.jetbrains.annotations.NotNull()
    com.karthyks.dice.testframework.ServerPort p0) {
    }
    
    private final kotlinx.coroutines.test.TestDispatcher getTestDispatcher() {
        return null;
    }
    
    @org.junit.Before()
    public final void start() {
    }
    
    @org.junit.After()
    public final void stop() {
    }
    
    private final void testRun(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CoroutineScope, kotlin.Unit> block) {
    }
    
    public final <T extends java.lang.Object>void waitForState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends T> $this$waitForState, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, long timeOutMs, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
    }
    
    public final <T extends java.lang.Object>void waitForState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$waitForState, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, long timeOutMs, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
    }
    
    public final <T extends java.lang.Object, R extends java.lang.Object>void assertItem(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$assertItem, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> propertyToAssert, R equalsTo, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, long timeOutMs) {
    }
    
    public final <T extends java.lang.Object, R extends java.lang.Object>void assertItem(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$assertItem, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> onProperty, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super R, java.lang.Boolean> predicate, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, long timeOutMs) {
    }
    
    public final <T extends java.lang.Object, R extends java.lang.Object>void assertItem(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends T> $this$assertItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> onProperty, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super R, java.lang.Boolean> predicate, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, long timeOutMs) {
    }
}