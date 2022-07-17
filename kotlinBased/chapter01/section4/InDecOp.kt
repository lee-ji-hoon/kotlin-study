package chapter01.section4

fun main() {
    var a: Int = 10
    var b: Int = 10

    var result1 = ++a // 증가 후에 대입
    var result2 = b++ // 대입 후에 증가

    println("result1 : $result1, result2 : $result2") // result1 : 11, result2 : 10
    println("a : $a, b : $b") // a : 11, b : 11
}