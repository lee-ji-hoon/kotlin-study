package javaToKotlin.chapter04.section04

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
    // fillter : 사과만 주세요!
    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    // 필터에서 인덱스까지 필요하다면?
    val applesWithIndex = fruits.filterIndexed {idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    // map : 사과의 가격들을 알려주세요!
    val applePrices = fruits.filter {fruit -> fruit.name == "사과"}
        .map { fruit -> fruit.price }

    // map 에서 index가 필요하다면?
    fruits.filter {fruit -> fruit.name == "사과"}
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.price
        }
    val fruitMap = mutableMapOf<String, Int>()
    fruitMap.put("apple", 5000)

    // mapping의 결과가 null이 아닌 것만 가져오고 싶다면
    val applPriceNonNull = fruits.filter{fruit -> fruit.name  == "사과"}
        .mapNotNull { fruit -> fruit.nullOrValue() }

    // all : 조건을 모두 만족하면 true 아니면 false
    val isAllApple = fruits.all {fruit -> fruit.name == "사과" }
    // none : 조건을 모두 불만족하면 true 아니면 false
    val isNoApple = fruits.none {fruit -> fruit.name == "사과" }
    // any : 조건을 하나라도 만족하면 true 아니면 false
    val isAnyApple = fruits.any {fruit -> fruit.name == "사과" }

    // 총 과일 개수를 보여주세요
    val fruitCount = fruits.count()
    // 낮은 가격순으로 보여주세요!
    //  sortedBy : 오름차순으로 정렬을 한다.
    val fruitSort = fruits.sortedBy { fruit -> fruit.price }
    // 역정렬을 하고 싶다면
    val fruitSortByDescending = fruits.sortedByDescending { fruit -> fruit.price }
    // 중복을 제거 한다.
    val distinctFruitName = fruits.distinctBy { fruit -> fruit.name }
        .map{fruit -> fruit.name }
    // 첫 번째, 마지막 과일
    val firstFruit = fruits.first()
    val firstOrNullFruit = fruits.firstOrNull()
    val lastFruit = fruits.last()
    val lastOrNullFruit = fruits.lastOrNull()

    // 과일이름 -> List<과일>
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    // id -> 과일이필요한 Map!, associateBy -> 중복되지 않은 값으로 매핑을 할 때
//    val idMap: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    // key와 value를 동시에 처리할 수 있다.

    // 과일이름 -> 가격 Map이 필요하다.
    val map2: Map<String, List<Int>> = fruits
        .groupBy({fruit -> fruit.name}, {fruit -> fruit.price})
}

private fun filterFruits(
    fruits: List<Fruit>, filler:(Fruit) -> Boolean
): List<Fruit>{
    /*val results = mutableListOf<Fruit>()
    for(fruit in fruits)
        if(filler(fruit))
            results.add(fruit)
    return results*/
    // 위 코드를 map으로!

    return fruits.filter(filler)
}

data class Fruit(
    val name: String,
    val price: Int

) {
    fun nullOrValue(): Boolean {
        return this.price == null
    }
}




