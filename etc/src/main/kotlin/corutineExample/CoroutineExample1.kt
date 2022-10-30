package corutineExample

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun main() {
    val measureTimeMillis = measureTimeMillis {
        CoroutineScope(Dispatchers.Unconfined).launch {
            launch { jobA() }
            launch { jobB() }
        }.join()
    }
    println("종료 : ${measureTimeMillis}")
}

suspend fun jobA() {
    repeat(100) {
        println("[jobA] 시작 (${Thread.currentThread().name})")
        delay(100)
        println("[jobA] 종료 (${Thread.currentThread().name})")
    }
}

suspend fun jobB() {
    repeat(100) {
        println("[jobB] 시작 (${Thread.currentThread().name})")
        delay(100)
        println("[jobB] 종료 (${Thread.currentThread().name})")
    }
}
