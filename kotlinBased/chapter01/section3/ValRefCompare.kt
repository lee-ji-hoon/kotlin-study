package chapter01.section3

fun main() {
    val a: Int = 128
    val b = a // Int형으로 추론 됨
    val c: Int? = a // c는 a의 주소를 가리키고 있다. c -> a
    val d: Int? = a // d는 a의 주소를 가리키고 있다. d -> a
    val e: Int? = c // e는 c의 주소를 가리키고 있다. e -> c -> a

    println(c == d) // true
    println(c === d) // false
    println(c === e) // true
}