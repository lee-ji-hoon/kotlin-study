package chapter02.chapter04.section2

fun main() {
    var total = 0

    // 1 3 5 ~ 99
    for(num in 1..100 step 2)
        total += num
    println("total = $total")
}