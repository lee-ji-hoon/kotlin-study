package pattern.observer

class EventPrinter {

    private val counter = Counter { count -> println("현재 ${count}회 입니다.") }

    fun start() {
        counter.startCount()
    }
}
