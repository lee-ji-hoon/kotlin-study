package corutineExample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        routineA()
    }

    CoroutineScope(Dispatchers.IO).launch {
        routineB()
    }

    CoroutineScope(Dispatchers.IO).launch {
        routineC()
    }.join()


}

suspend fun routineA() {
    println("[routineA] 시작 Thread (${Thread.currentThread().name})")
    delay(3000)
    println("[routineA] 종료 Thread (${Thread.currentThread().name})")
}

suspend fun routineB() {
    println("[routineB] 시작 Thread (${Thread.currentThread().name})")
    delay(4000)
    println("[routineB] 종료 Thread (${Thread.currentThread().name})")
}

suspend fun routineC() {
    println("[routineC] 시작 Thread (${Thread.currentThread().name})")
    delay(5000)
    println("[routineC] 종료 Thread (${Thread.currentThread().name})")
}
