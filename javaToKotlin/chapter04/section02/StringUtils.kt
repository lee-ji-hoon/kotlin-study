package javaToKotlin.chapter04.section02

fun main() {
    val str = "ABC"
    val lastChar = str.lastChar() // C 출력
    println(lastChar)

    var person = Person("Lee", "Hoon", 25)
    println(person.nextYearAge())
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

// Extension is shadowed by a member: public open fun nextYearAge(): Int
// 확장이 멤버에 의해 숨겨져 있습니다. public open fun nextYearAge(): Int
// 즉 멤버함수가 우선적이다!
fun Person.nextYearAge(): Int{
    println("확장 함수")
    return this.age + 1;
}