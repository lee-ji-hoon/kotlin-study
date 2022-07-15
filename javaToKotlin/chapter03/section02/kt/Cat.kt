package javaToKotlin.chapter03.section02.kt

class Cat(
    species: String
// : 쓸 때 한칸씩 띄워줘야 함
) : Animal(species, 4) { // 상속받았다고 표시하는 부분에 바로 필드값을 넣어줘야 한다.
    override fun move() { // @orverride 어노테이션이 아닌 지시어다!
        println("고양이가 움직인다.")
    }
}