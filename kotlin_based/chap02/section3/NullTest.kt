package chap02.section3

fun main() {
    var str1: String?
    str1 = null
    val len = str1?.length ?: -1 // str1이 널이면 len에 -1입력
    println("str1 : $str1, length: $len")
}