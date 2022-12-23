package flowExample

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

fun main() = runBlocking<Unit> {
/*    val nums = (1..3).asFlow().onEach { delay(300) }
    val list = listOf(1, 2, 3)
    val strs = flowOf("one", "two", "three").onEach { delay(400) }
    val startTime = System.currentTimeMillis()

    val result = nums.combine(strs) { a, b -> "$a -> $b" }.stateIn(
        CoroutineScope(Dispatchers.IO)
    )

    result.collect { value ->
//        println("$value at ${System.currentTimeMillis() - startTime} ms from start")
    }
    */

    runCatching { connect() }.onFailure {
        println(it)
    }
}

suspend fun connect() {
    val result = suspendCancellableCoroutine<Int> { continuation ->
        continuation.resumeWithException(Exception("가나다"))
        println("result end1")
    }

    val result2 = suspendCoroutine<Int> { continuation ->
        continuation.resumeWithException(Exception("가나다2"))
        println("result end2")
    }
}

fun fetchData(query: String): String {
    return "result : query"
}
