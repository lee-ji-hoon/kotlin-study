package chapter02.section2

fun main() {
    val result = callByValue(lambda()) // 람다식 호출
    println("result = $result")
}

fun callByValue(b: Boolean): Boolean{ // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = { // 람다 표현식 2줄 이상
    println("lambda function")
    true // 마지막 표현식의 문장의 결과만 반환
}