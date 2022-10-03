package corutineExample

import java.util.concurrent.Executors

fun main() {
    val executerService = Executors.newFixedThreadPool(4);

    executerService.submit(ExampleRunnable())
    executerService.submit(ExampleRunnable())
}

class ExampleRunnable : Runnable {
    override fun run() {
        println("Runnable Running")
        println(Thread.currentThread())
    }
}