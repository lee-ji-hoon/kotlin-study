package javaToKotlin.chapter03.section04.kt

import javaToKotlin.chapter03.section04.java.Movable

fun main() {
    // java 에서는 new 타입이름() -> kotlin은 object : 타입 이름 { }
    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    // 코틀린에는 static이 존재하지 않는다.
    companion object Factory{ // 동행 객체
        private const val MIN_AGE = 0 // const를 붙이면 컴파일시 변수가 할당이 된다. 즉 진짜 상수에 붙이기 위한 용도
        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}






