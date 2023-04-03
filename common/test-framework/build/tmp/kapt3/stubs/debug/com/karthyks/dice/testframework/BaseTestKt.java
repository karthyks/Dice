package com.karthyks.dice.testframework;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0006\u0010\u0006\u001a\u00020\u0001\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"MOCK_SERVER_PORT", "", "getMOCK_SERVER_PORT", "()I", "setMOCK_SERVER_PORT", "(I)V", "getServerPort", "test-framework_debug"})
public final class BaseTestKt {
    private static int MOCK_SERVER_PORT = 2221;
    
    public static final int getMOCK_SERVER_PORT() {
        return 0;
    }
    
    public static final void setMOCK_SERVER_PORT(int p0) {
    }
    
    public static final int getServerPort() {
        return 0;
    }
}