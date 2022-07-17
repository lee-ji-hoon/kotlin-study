package chapter01

fun main() {
    var b = 1
    val s1 = "a is $b"
    println("s1 : \"$s1\" ")

    var a = 1
    var str1 = "a = $a"
    val str2 = "a = ${a + 2}" // 문자열에 표현식 사용

    println("str1 : \"$str1\", str2 : \"$str2\"")
}