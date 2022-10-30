package corutineExample

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun main() {
    val coroutineContext = Dispatchers.IO + CoroutineName("IO")
    val measureTimeMillis = measureTimeMillis {
        CoroutineScope(coroutineContext).launch() {
            launch { suspendTask1() }
            launch { suspendTask2() }
        }.join()
    }
    println("[총 걸린 시간] -> ${measureTimeMillis}")
}

suspend fun suspendTask1() {
    delay(1000)
    log("[SuspendTask1] 1초 sleep")
    delay(3000)
    log("[SuspendTask1] 4초 sleep")

    log("[SuspendTask1] 종료 Thread")
}
suspend fun suspendTask2() {
    delay(2000)
    log("[SuspendTask2] 2초 sleep")
    delay(3000)
    log("[SuspendTask2] 5초 sleep")

    log("[SuspendTask2] 종료")
}

fun log(message: String) =
    println("$message [${Thread.currentThread().name}]")