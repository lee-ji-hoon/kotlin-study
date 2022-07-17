package chapter02.chapter04.section1

fun main() {
    print("Enteer the score: ")
    val score = readLine()!!.toDouble() // 편하게 테스트하기 위해서 !! 사용
    var grade: Char = 'F'

    grade = if(score >= 90.0) 'A'
    // 범위 연산자를 사용한 방법으로 변경
    else if(score in 80.0..89.9) 'B'
    else if(score in 70.0..79.9) 'C'
    else if(score in 60.0..69.9) 'D'
    else 'F'

    println("grade = $grade")

}