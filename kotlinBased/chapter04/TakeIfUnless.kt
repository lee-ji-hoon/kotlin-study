package chapter02.chapter04

fun main() {
    val input = "Kotlin"
    val keyword = "in"

    // 입력 문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeIf를 사용해서 구현
    input.indexOf(keyword).takeIf{it >= 0} ?: error("Keyword Not Found")
    // takeUnless
    input.indexOf(keyword).takeUnless{it < 0} ?: error("Keyword Not Found")
}