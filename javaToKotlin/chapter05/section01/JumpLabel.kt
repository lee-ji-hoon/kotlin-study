package javaToKotlin.chapter05.section01

fun main() {
    val numbers = listOf(1, 2, 3)
    numbers.map { number -> number + 1 }
        .forEach { println(it) }
    numbers.map { it + 1 }
        .forEach(System.out::println)

    run {
        numbers.forEach { number ->
            if (number == 2)
                return@run
        }
    }

    numbers.forEach { number ->
        if (number == 2)
            return@forEach
    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if(j == 2)
                break@loop
            println("${i} ${j}")
        }
    }
}
fun getNumberOrNull(number: Int): Int?{
    // takeIf -> 주어진 조건을 만족하면 그 값이 아니면 null이 반환
    return number.takeIf { number -> number > 0 }
}

fun getNumberOrNull3(number: Int): Int?{
    // takeUnless -> 주어진 조건을 만족하지 않으면 그 값이 그렇지 않으면 null
    return number.takeUnless { number -> number > 0 }
}