package etc

private var stopRequested = false

fun main() {
    val Thread1 = Thread {
        var i = 0
        while (!stopRequested) {
            i++
        }
    }
    Thread1.start()
    Thread.sleep(1000)
    stopRequested = true
}
