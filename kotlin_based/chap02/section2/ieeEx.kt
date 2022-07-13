package part1

fun main() {
    var num: Double = 0.1

    for (x in 0..999) // 0 ~ 999까지 즉 1000번
        num += 0.1

    println("num : $num")
}