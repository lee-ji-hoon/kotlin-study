package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "Hello"
    var str3 = "Hello"

    // ==  값만 비교
    // === 참조까지 비교
    println("str1 === str2 ${str1 === str2}") // true ===은 주소값 비교이니 false가 나오는게 맞지 않나?
    println("str1 === str3 ${str1 === str3}") // true
}