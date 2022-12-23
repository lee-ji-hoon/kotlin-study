package flowExample

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.callbackFlow

val emittingScope = CoroutineScope(Dispatchers.IO)
val collectingScope = CoroutineScope(Dispatchers.Default)

fun main(): Unit = runBlocking {
    delay(1000)
    println("Emit 1 before collect")
    emitSharedData(1)
    delay(1000)
    println("Collect started")
    val job1 = collectSharedData()
    delay(1000)
}

val stateFlow = MutableStateFlow(0)
fun emitStateData(value: Int) {
    emittingScope.launch {
        println("emitted $value")
        stateFlow.emit(value)
    }
}

fun collectStateData() =
    collectingScope.launch {
        stateFlow.collect {
            println("collected $it")
        }
    }

val sharedFlow = MutableSharedFlow<Int>()
fun emitSharedData(value: Int) {
    emittingScope.launch {
        println("emitted $value")
        sharedFlow.emit(value)
    }
}

fun collectSharedData() =
    collectingScope.launch {
        sharedFlow.collect {
            println("collected $it")
        }
    }
