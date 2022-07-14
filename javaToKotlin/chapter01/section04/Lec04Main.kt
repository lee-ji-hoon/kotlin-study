package javaToKotlin.chapter01.section03

import javaToKotlin.chapter01.section04.JavaMoney
import javaToKotlin.chapter01.section04.Money

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println("동일성 : 주소를 비교")
    println("money1 === money2 = ${money1 === money2}") // 동일성 비교 (주소값)
    println("money1 === money3 = ${money1 === money3}") // 동일성 비교 (주소값)
    println("동등성 : 값을 비교")
    println("money1 == money3 = ${money1 == money2}") // 동등성 비교 (amount)
    println("money1 == money3 = ${money1 == money3}") // 동등성 비교 (amount) -> equals를 재정의 했으면 true 아니면 false

    // fun1()의 값만 보고 fun2()를 보지 않는다.
    // true -> true
    // false -> false
    if (fun1() || fun2()) {
        println("본문")
    }

    val money4 = Money(1_000L)
    val money5 = Money(2_000L)
    println(money4 + money5) // Money(amount=3000)
}

fun fun1(): Boolean{
    println("fun1")
    return true
}

fun fun2(): Boolean{
    println("fun2")
    return false
}