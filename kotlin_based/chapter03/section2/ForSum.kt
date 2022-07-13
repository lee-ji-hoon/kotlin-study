package chapter02.chapter04.section2

// 1~10까지 더하기
fun main() {
    var sum = 0;
    for (x in 1..10)
        sum += x
    println("sum = $sum")
}