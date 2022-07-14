package chapter02.chapter04

fun main() {
    data class User(var name: String, var skills: String, var email: String? = null)
    var user = User("Killdong", "Kotlin")

    val result = with(user){
        skills = "Java"
        email = "jihoon@gmail.com"
        // 마지막 식이 존재하지 않으면 기본적으로 Unit 반환
        "Success"
    }
    println(user)
    println("result = ${result}")
}