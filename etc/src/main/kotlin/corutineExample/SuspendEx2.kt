package corutineExample

import kotlinx.coroutines.*
import kotlinx.coroutines.selects.SelectClause1
import kotlin.system.measureTimeMillis

suspend fun main() {
    val launch = CoroutineScope(Dispatchers.IO).launch() {
        launch { noSuspendTask1() }
        launch { noSuspendTask2() }
    }

    repeat(1000) {
        println("[onDraw] -> Thread (${Thread.currentThread().name})")
    }

    launch.join()
}

fun noSuspendTask1() {
    Thread.sleep(1000)
    println("[NoSuspendTask1] 1초 sleep")
    Thread.sleep(3000)
    println("[NoSuspendTask1] 4초 sleep")

    println("[NoSuspendTask1] 종료")
}

fun noSuspendTask2() {
    Thread.sleep(2000)
    log("[NoSuspendTask2] 2초 sleep")
    Thread.sleep(3000)
    log("[NoSuspendTask2] 5초 sleep")

    log("[NoSuspendTask2] 종료")
}

