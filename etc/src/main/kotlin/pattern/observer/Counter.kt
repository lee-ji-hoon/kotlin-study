package pattern.observer

class Counter(
    private val listener: EventListener
) {

    fun startCount() {
        repeat(100) {
            if (it % 2 == 0) listener.onEvent(it)
        }
    }
}
