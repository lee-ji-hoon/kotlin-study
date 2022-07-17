package chapter02.chapter04.section2

fun main() {
    val n = readLine()!!.toInt()
    // 1. 몇 줄로 이루어진 별인지
    for (floor in 1..n) {
        // 2. 공백
        for (space in 1..n - floor)
            print(" ")
        // 3. 별 1 -> (i * 2 - 1)
        for (star in 1 until floor * 2)
            print("*")
        println()
    }
}
