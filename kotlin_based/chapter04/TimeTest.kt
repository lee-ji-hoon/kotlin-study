package chapter02.chapter04

import kotlin.system.measureTimeMillis

fun main() {
    val executionTime = measureTimeMillis {
        for (i in 1..10000)
            // 작업 실행
            print(i)
    }
    println()
    println("executionTime = $executionTime") // executionTime = 140
}
