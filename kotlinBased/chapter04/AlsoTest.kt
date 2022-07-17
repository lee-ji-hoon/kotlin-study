package chapter02.chapter04

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Killdong", "Kotlin")

    val a = person.let{
        it.skills = "Android"
        "success" // 마지막 문장 반환
    }

    println(person)
    println("a = $a")

    val b = person.also{
        it.skills = "Java"
        "success" // 마지막 문장 사용 안됨
    }
    println(person)
    println("b = $b") // Person 객체 b
}



