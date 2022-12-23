fun main() {
    functionA(1)
    functionB(4)
    functionA(2)
    functionA(3)
}

fun functionA(time: Int) {
    repeat(2) {
        println("functionA $time")
    }
}

fun functionB(time: Int) {
    repeat(2) {
        println("functionB $time")
    }
}
