package sealedExample

sealed interface UiState {
    class Success<T>(val data: T): UiState
    class Error(val error: Throwable?): UiState
    object Loading: UiState
}