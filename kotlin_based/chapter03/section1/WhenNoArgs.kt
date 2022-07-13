package chapter02.chapter04.section1

fun main() {
    print("Enter the score: ")
    var score = readLine()!!.toDouble()
    var grade: Char = 'F'

    // 인수 없는 when 사용
    when{
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score in 60.0..69.9 -> grade = 'D'
    }
    println("Score : $score, Grade : $grade")
}