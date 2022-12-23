package flowExample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val nums = (1..3).asFlow().onEach { delay(300) }
    val list = listOf(1, 2, 3)
    val strs = flowOf("one", "two", "three").onEach { delay(400) }
    val startTime = System.currentTimeMillis()

    val result = nums.combine(strs) { a, b -> "$a -> $b" }.stateIn(
        CoroutineScope(Dispatchers.IO)
    )

    result.collect { value ->
        println("$value at ${System.currentTimeMillis() - startTime} ms from start")
    }
}

fun fetchData(query: String): String {
    return "result : query"
}
