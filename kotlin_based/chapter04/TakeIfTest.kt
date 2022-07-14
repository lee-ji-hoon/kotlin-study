package chapter02.chapter04
fun main() {
    data class Object(var name: String, var status: Boolean)
    var someObject = Object("기계", true)

    if(someObject != null && someObject.status)
        doThis()
    // 개선 코드
    if(someObject?.status == true)
        doThis()
    // takeIf를 사용해 개선한 코드
    someObject?.takeIf { it.status }?.apply { doThis() }
}

fun doThis() {
    println("실행됐따.")
}




