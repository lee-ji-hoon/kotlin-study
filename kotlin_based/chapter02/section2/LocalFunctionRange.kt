package chapter02.section2

fun a() = b()
fun b() = println("b")

fun c() {
//    fun d() = e() // 지역 함수 선언이 호출보다 늦게 돼 있으므로 오류
    fun e() = println("e")
}

fun main() {
    a()
//    e() // fun e()는 c의 지역함수 이므로 c 블록 내에서 호출을 해야 한다.
}