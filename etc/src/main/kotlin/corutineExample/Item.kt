package corutineExample

import kotlinx.coroutines.*

suspend fun main() {
    val job = CoroutineScope(Dispatchers.IO).launch {
        println("job 실행 -> ${this}")
    }
    printJob(job)
    job.cancel()
    printJob(job)
    delay(3000)
    printJob(job)
}

private fun printJob(job: Job) {
    println("job.isActive -> ${job.isActive}")
    println("job.isCancelled -> ${job.isCancelled}")
    println("job.isCompleted -> ${job.isCompleted}")
    println()
}