package javaToKotlin.chapter01.section02

import javaToKotlin.chapter01.Person

fun main() {
    val person = Person("공부하는 개발자")
    // Java 코드단에서 Null 관련 정보가 없을 경우?
    startsWith(person.name) // person의 name 객체는 null이 들어올 수도 있음에도 오류를 못찾는다.
    // 즉 코틀린에서 자바코드를 사용하기 위해서는 null 관련 정보를 꼼꼼히 작성해야만 한다!
}

// 자바코드에 @NotNUll 어노테이션이 제공돼 있기 때문에 무조건 null이 안들어온다.
// 즉 코틀린에서 자바 코드의 어노테이션의 정보를 가져올 수 있다는 의미이다.
fun startsWith(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean{
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean?{
    return str?.startsWith("A") // 세이프콜은 null인 경우 값이 null로 출력이 되기 때문에 더 이상의 코드는 필요 없다.
}

fun startWithA3(str: String?): Boolean{
    return str?.startsWith("A") ?: false
}

fun calculate(number: Long?): Long{
    number ?: return 0 // null인 경우 return 0
    // 다음 로직
    return number + number
}

fun startsWith4(str: String?): Boolean{
    // str은 절대로 null이 아니야!!
    return str!!.startsWith("A")
}
