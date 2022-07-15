package javaToKotlin.chapter01.section01

import java.util.*

fun main() {
    // 1. for-each
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers)
        println(number)
    // 2. 전통적인 for문
    for (i in 1..3)
        println(i)
    // 2-1. 내려가고 싶은 경우
    // 높은 숫자 downTo 내려가고 싶은 숫자
    for(i in 4 downTo 1)
        println(i)

    // 2-2. 마지막 숫자를 포함하고 싶지 않은 경우
    // in으로 할경우 3까지 포함되므로 until을 사용해야 한다.
    for(i in 1 until 3)
        println(i)

    // 2-3. 2칸씩 올라가고 싶은 경우
    // 마지막에 step 2
    for(i in 1..5 step 2)
        println(i)
}





