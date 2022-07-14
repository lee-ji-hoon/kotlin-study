package chapter02.chapter04

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Killdong", "Kotlin")

    // 여기서 this는 person 객체를 가리키 + 생략 가능
    person.apply { skills = "Swift" }
    // also는 it생략 불가능!
    person.also {it.skills = "Kotlin"}

    println(person)

    val returnObj = person.apply{
        name = "Sean" // this를 생략할 수 있음
        skills = "Java" // this 객체 없이 멤버에 여러번 접근
    }
    println("Person: $person")
    println("returnObj: $returnObj")


}