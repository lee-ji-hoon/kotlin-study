package flowExample

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    println("runBlocking Thread -> ${Thread.currentThread()}")
    flow {
        println("flow Thread -> ${Thread.currentThread()}")
        (1..5).forEach {
            println("forEach Thread -> ${Thread.currentThread()}")
            emit(it)
        }
    }
        .filter {
            println("Filter Thread -> ${Thread.currentThread()}")
            it % 2 != 0
        }
        .map {
            println("Map Thread -> ${Thread.currentThread()}")
            "*".repeat(it)
        }
        .flowOn(Dispatchers.IO)
        .onEach { value -> println(value) }
        .launchIn(this)

    launch(Dispatchers.IO) {
        println("Launch1 Thread -> ${Thread.currentThread()}")
        launch {
            println("Launch2 Thread -> ${Thread.currentThread()}")
            launch {
                println("Launch3 Thread -> ${Thread.currentThread()}")
            }
        }
    }
}
