package etc

private var stopRequested = false

fun main() {
    // JVM 상에서 Memory 위치는 같다.
    // 사용을 할 때 CPU Cache 여기를 들린다.
    val thread1 = Thread {
        var i = 0
        while (stopRequested.not()) {
            i++
        }
    }
    thread1.start()
    stopRequested = true
    Thread.sleep(1000)
}

/**
 * 전 false 1609588821
 * 후 true 1531448569
 */
