package javaToKotlin.chapter03.section02.kt

interface Swimable {
    val swimAbility: Int // 프로퍼티를 인터페이스에서 만들 수 있다.즉 getter
        get() = 3

    fun act(){
        println(swimAbility)
        println("어푸어푸")
    }
}