package flowExample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun foo(): Flow<Int> = flow {
    println("Flow started")
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

fun stateFlow() = foo().stateIn(
    initialValue = 1,
    started = SharingStarted.WhileSubscribed(5000),
    scope = CoroutineScope(Dispatchers.IO)
)

fun main(): Unit = runBlocking {
    println("Calling foo...")
    val flow = foo()
    println("Calling collect...")
    flow.collect { value -> println(value) }
    println("Calling collect again...")
    flow.collect { value -> println(value) }

    val stateFlow = stateFlow()
    println("Calling StateFlow ...")
    stateFlow.collectLatest { value -> println(value) }
    println("Calling StateFlow again...")
    stateFlow.collectLatest { value -> println(value) }
}