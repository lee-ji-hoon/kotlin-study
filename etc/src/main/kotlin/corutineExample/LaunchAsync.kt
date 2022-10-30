package corutineExample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import sun.rmi.runtime.Log

fun main() {
    val job3 = CoroutineScope(Dispatchers.Default).async {
        println("job3 수행시작")
        (1..100).sortedByDescending { it }
    }
    val job1 = CoroutineScope(Dispatchers.IO).launch {
        println("job1 수행시작")
        val job3Result = job3.await()

        job3Result.forEach {
            println("$it")
        }
    }
    val job2 = CoroutineScope(Dispatchers.IO).launch {
        println("job2 수행완료")
    }
}
