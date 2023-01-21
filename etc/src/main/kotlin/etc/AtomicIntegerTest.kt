package etc

import java.util.concurrent.atomic.AtomicInteger

private var count = 0

// volatile -> 가시성 문제 해결
// synchronized -> 가시성 + 원자성 해결 단 blocking 한다는 특징
// atomic -> 가시성 + 원자성 해결하면서 non-blocking

fun main() {
    val atomicCount = AtomicInteger(0)
    val key = "key"
    val thread1 = Thread {
        for (i in 0..999_999) {
            synchronized(key) {
                count++
            }
            atomicCount.getAndAdd(1)
        }
    }
    val thread2 = Thread {
        for (i in 0..999_999) {
            synchronized(key) {
                count++
            }
            atomicCount.getAndAdd(1)
        }
    }
    thread1.start()
    thread2.start()
    thread2.join()
    thread1.join()
    println("atomic 결과 : " + atomicCount.get())
    println("int 결과 : $count")

    val test1 = atomicCount.getAndAdd(10)
    val test2 = atomicCount.incrementAndGet()
    println("$test1 / $test2")
}
