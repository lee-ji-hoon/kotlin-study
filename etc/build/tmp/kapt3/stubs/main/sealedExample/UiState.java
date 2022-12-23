package sealedExample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"LsealedExample/UiState;", "", "Error", "Loading", "Success", "LsealedExample/UiState$Error;", "LsealedExample/UiState$Loading;", "LsealedExample/UiState$Success;", "etc"})
public abstract interface UiState {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"LsealedExample/UiState$Success;", "T", "LsealedExample/UiState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "etc"})
    public static final class Success<T extends java.lang.Object> implements sealedExample.UiState {
        private final T data = null;
        
        public Success(T data) {
            super();
        }
        
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"LsealedExample/UiState$Error;", "LsealedExample/UiState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "etc"})
    public static final class Error implements sealedExample.UiState {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable error = null;
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"LsealedExample/UiState$Loading;", "LsealedExample/UiState;", "()V", "etc"})
    public static final class Loading implements sealedExample.UiState {
        @org.jetbrains.annotations.NotNull()
        public static final sealedExample.UiState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}