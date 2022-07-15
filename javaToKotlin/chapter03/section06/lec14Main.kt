package javaToKotlin.chapter03.section06

fun main () {
    val dto1 = PersonDto(name = "이지훈", age = 25)
    val dto2 = PersonDto(name = "이지훈", age = 24)
    val dto3 = PersonDto(name = "이지훈", age = 25)
    println(dto1 == dto2) // false
    println(dto1 == dto3) // true
    println(dto1) // PersonDto(name=이지훈, age=25)
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

fun handleCountry(country: Country){
    when (country) { // Enum 클래스에 값이 추가가 되면 추가 할 것인지 알려주게 된다.
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        // else -> 필요가 없다!
    }
}

enum class Country(
    private val code: String
){
    KOREA("KO"),
    AMERICA("US"),
    A("A");
}

// data를 붙이면 hashcode, toString, toString을 자동으로 만들어준다.
data class PersonDto(
    val name: String,
    val age: Int
)





