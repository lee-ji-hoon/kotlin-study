package chapter01.section3

fun main() {
    checkArg("Hello") // 문자열을 인자로 넣음
    checkArg(5) // 숫자를 인자로 넣음
}

fun checkArg(s: Any) {
    if(s is String)
        println("x is String : $s")
    else if(s is Int)
        println("x is Int : $s")
}
