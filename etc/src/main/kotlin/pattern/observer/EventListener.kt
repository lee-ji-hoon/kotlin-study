package pattern.observer

fun interface EventListener {
    fun onEvent(count: Int)
}
