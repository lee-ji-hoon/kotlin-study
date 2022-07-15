package javaToKotlin.chapter03.section04.kt

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

// object를 쓰면 싱글톤이 된다.
object Singleton {
    var a: Int = 0
}
