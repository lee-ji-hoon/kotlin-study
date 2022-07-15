package javaToKotlin.chapter03.section02

fun main() {
    println(Derived(500).number)
}

open class Base(
     val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    val numbers: Int
) : Base(numbers) {
    init {
        println("Derived Class")
    }
}





