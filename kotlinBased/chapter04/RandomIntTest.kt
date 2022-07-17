package chapter02.chapter04

import kotlin.random.Random

fun main() {
    // 0~21사이의 난수를 제공
    for (i in 1..20) {
        val number = Random.nextInt(21)
        print(" $number")
    }
}