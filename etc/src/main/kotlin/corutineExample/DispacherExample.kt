package corutineExample

import kotlinx.coroutines.*

suspend fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        supervisorScope {
            val firstChildJob = launch(Dispatchers.IO) {
                throw AssertionError("첫 째 Job이 AssertionError로 인해 취소됩니다.")
            }

            val secondChildJob = launch(Dispatchers.Default) {
                delay(1000)
                println("둘 째 Job이 살아있습니다.")
            }

            val thirdChildJob = launch(Dispatchers.Unconfined) {
                delay(1000)
                println("셋 째 Job이 살아있습니다.")
            }

            firstChildJob.join()
            secondChildJob.join()
            thirdChildJob.join()
        }
    }.join()
}