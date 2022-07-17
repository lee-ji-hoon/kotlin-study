package chapter02.chapter04.section1

fun main() {
    print("Enteer the score: ")
    val score = readLine()!!.toDouble() // 편하게 테스트하기 위해서 !! 사용
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        in 60.0..69.9 -> grade = 'D'

    }
    println("grade = $grade")
}