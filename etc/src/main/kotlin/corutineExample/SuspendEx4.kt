package corutineExample

import kotlinx.coroutines.delay
import kotlinx.coroutines.suspendCancellableCoroutine


suspend fun main() {
    check()

    delay(10000)
}
suspend fun check() {
    suspendCancellableCoroutine<String> {
        println("Thread (${Thread.currentThread().name})")
        println("Thread (${Thread.currentThread().name})")
        println("Thread (${Thread.currentThread().name})")
        "가나다"
    }
}