package javaToKotlin.chapter03.section03

val a = 3
fun add(a: Int){ }

// 원래는 public constructor인데 생략돼있는 상태이기 때문에 private을 쓰고 싶으면 constructor을 쓰자!
class Car (
    internal var name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set  // Setter에만 추가로 가시성을 부여할 수도 있다.
}






