package chapter02.chapter04.section2

fun main() {
    // 5 -> 12345, 23451, 34512
    do {
        println("Enter the number : ")
        val input = readLine()!!.toInt()

        // until 을 쓰면 input-1까지만 진행된다!
        for (i in 0 until input)
            for (j in 0 until input)
                print((i + j) % input + 1)
            println()

    } while (input != 0) // 입력이 0으로 들어오면 break
}