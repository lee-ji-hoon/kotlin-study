package chapter02.chapter04

fun main() {
    // apply run 비교
    data class Person(var name: String, var skills: String)
    var person = Person("Killdong", "Kotlin")

    val returnObj = person.apply{
        name = "Sean"
        skills = "Java"
        "Success" // 사용되지 않음
    }
    println(person)
    println("returnObj = ${returnObj}")
    val returnObj2 = person.run{
        name = "Dooly"
        skills = "C#"
        "Success" // apply와 다르게 마지막 식을 반환한다!
    }
    println(person)
    println("returnOjb2 = ${returnObj2}")
}