package etc

import java.util.concurrent.atomic.AtomicInteger

private var count = 0

fun main() {
    val atomicCount = AtomicInteger(0)
    val thread1 = Thread {
        for (i in 0..99999) {
            count++
            atomicCount.incrementAndGet()
        }
    }
    val thread2 = Thread {
        for (i in 0..99999) {
            count++
            atomicCount.incrementAndGet()
        }
    }
    thread1.start()
    thread2.start()
    Thread.sleep(5000)
    println("atomic 결과 : " + atomicCount.get())
    println("int 결과 : $count")
}
