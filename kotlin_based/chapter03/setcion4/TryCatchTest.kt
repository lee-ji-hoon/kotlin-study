package chapter02.chapter03.setcion4

import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
        println("나 실행되나요?") // Exception 발생했기 때문에 해당 라인까지 실행되지가 않는다.
    } catch (e: ArithmeticException) { // 정확한 Exception 잡아내기
        println(e.message) //  /by zero
        e.printStackTrace()
    } finally {
        println("Finally")
    }
}