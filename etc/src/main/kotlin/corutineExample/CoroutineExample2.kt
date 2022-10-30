package corutineExample

import kotlinx.coroutines.*
import kotlin.coroutines.ContinuationInterceptor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

suspend fun main() {
    CoroutineScope(Dispatchers.Default).launch {
        println("corutineExample.main scope ${Thread.currentThread().name} has started")
        val menuList: Deferred<MutableList<String>> = async {
            for (i in 0..50) {
                println("> corutineExample.main context ${Thread.currentThread().name} has started")
            }
            mutableListOf()
        }
        println("menu -> ${menuList.await()}")
    }
    CoroutineScope(Dispatchers.Default).launch {
        println("soup scope ${Thread.currentThread().name} has started")
        val soupList: Deferred<MutableList<String>> = async {
            for (i in 0..50) {
                println(">> soup context ${Thread.currentThread().name} has started")
            }
            mutableListOf()
        }
        println("soup -> ${soupList.await()}")
    }
    CoroutineScope(Dispatchers.Default).launch {
        println("side scope ${Thread.currentThread().name} has started")
        val soupList: Deferred<MutableList<String>> = async {
            for (i in 0..50) {
                println(">>> side context ${Thread.currentThread().name} has started")
            }
            mutableListOf()
        }
        println("side -> ${soupList.await()}")
    }

    delay(2000)
}
