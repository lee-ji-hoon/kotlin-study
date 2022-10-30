package corutineExample

import java.util.concurrent.Executors

fun main() {
    val executorService = Executors.newFixedThreadPool(5);
    executorService.submit(ExampleRunnable())
    executorService.submit(ExampleRunnable())
}

class ExampleRunnable : Runnable {
    override fun run() {
        println(Thread.currentThread())
    }
}