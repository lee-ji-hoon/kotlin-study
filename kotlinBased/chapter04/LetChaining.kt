package chapter02.chapter04

fun main() {
    var a = 1
    var b = 2

    a = a.let{it + 2}.let{
        println("a = $a")
        val i = it + b
        i // 람다식에는 마지막 값이 반환
    }
    println(a) // 5
}