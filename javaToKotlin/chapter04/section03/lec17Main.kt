package javaToKotlin.chapter04.section03

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // 람다를 만드는 방법 1
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean{
        return fruit.name == "사과"
    }
    // 람다를 만드는 방법 2 중괄호와 화살표 사용
    // (타입) -> 반환타입
    val isApple2 : (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}

    // 람다를 호출하는 방법 1
    isApple(fruits[0])
    // 람다를 호출하는 방법 2
    isApple.invoke(fruits[0])

    val filterFruit = filterFruits(fruits) {fruit -> fruit.name == "사과"}
    // 파라미터가 한 개인 경우 예약어 it을 사용해서 축약이 가능하다.
    val filterFruit2 = filterFruits(fruits) {it.name == "사과"}

    println(filterFruit)
}


private fun filterFruits(
    fruits: List<Fruit>, filler:(Fruit) -> Boolean
): List<Fruit>{
    val results = mutableListOf<Fruit>()
    for(fruit in fruits)
        if(filler(fruit))
            results.add(fruit)
    return results
}

data class Fruit(
    val name: String,
    val price: Int
)





