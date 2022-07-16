package javaToKotlin.chapter04.section01

fun main() {
    // 배열은 arrayOf
    var array = arrayOf(100, 200)

    // index 번호만
    // array에 들어가있는 번호를 세서 Range로 담아주는 것!
    for(i in array.indices)
        println("${i} ${array[i]}")

    // 인덱스와 value를 한 번에 받기
    for((idx, value) in array.withIndex())
        println("${idx} ${value}")

    // 배열임에도 새로운 element를 추가할 수 있다!
    array.plus(300)

    for(i in 0 until array.size)
        println("${i} ${array[i]}")

    // 2.
    val numbers = listOf(100, 200) // 타입 추론으로 인해 Int를 생략
//    val emptyList = emptyList<Int>() // 비어있는 리스트의 경우 타입이 무엇인지 알 수 없으므로 명시적으로 적어줘야 함

    printNUmbers(emptyList())

    // 하나 갖고오기
    println(numbers.get(0))
    println(numbers[0]) // 배열처럼 배열[index]도 가능하다.
    // for-each
    for(i in numbers)
        println("${i}")
    for((idx, value) in numbers.withIndex()) // idx와 value 둘 다 갖고 오고 싶을 때 withIndex()
        println("${idx} ${value}")
    // 전통적인 for
    for(i in 0 until numbers.size)
        println("${i} ${numbers.get(i)}")

    // 가변 리스트를 만들때
    val mutableNumbers = mutableListOf(100, 200) // 타입 추론으로 인해 Int를 생략
    mutableNumbers.add(300)

    val setNumbers = setOf(100, 200)
    val mutableSetNumbers = mutableSetOf(100, 200) // 기본 구현체는 LinkedHashSet이다.
    val test: MutableList<Int> = mutableListOf()
    test.add(10)

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap.put(2, "TUESDAY")

    for(key in oldMap.keys) {
        println(key)
        println(oldMap[key])
        println(oldMap.get(key))
    }

    for((key, value) in oldMap.entries){
        println(key)
        println(value)
    }

    oldMap[1] = "MODAY" // 로도 가능하다!
    oldMap[2] = "TUESDAY" // 로도 가능하다!
    val mapOf = mapOf(3 to "Wednesday", 4 to "Thursday") // a to b -> step 처럼 중위 호출이다!

}

private fun printNUmbers(numbers: List<Int>) { }



