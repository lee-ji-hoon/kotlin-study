package nomagic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0013\u001a\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lnomagic/MyContinuation;", "Lkotlin/coroutines/Continuation;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "label", "", "getLabel", "()I", "setLabel", "(I)V", "result", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "resumeWith", "", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "etc"})
public final class MyContinuation implements kotlin.coroutines.Continuation<java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext context = null;
    private int label = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String result = "";
    
    public MyContinuation() {
        super();
    }
    
    public MyContinuation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getContext() {
        return null;
    }
    
    public final int getLabel() {
        return 0;
    }
    
    public final void setLabel(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void resumeWith(@org.jetbrains.annotations.NotNull()
    java.lang.Object result) {
    }
}