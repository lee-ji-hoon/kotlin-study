package javaToKotlin.chapter01.section03

import javaToKotlin.chapter01.Person

fun main() {
    val number1 = 4
//    val number2: Long = number1 // Type mismatch
    val number2: Long = number1.toLong() // 올바른 형변환!
    println(number1 + number2)

    var number3: Int? = 3
    // number3이 null이 될수도 있으므로 safe call과 Elvis 연산자를 적절히 사용해야 한다.
    // number3이 null이 들어올 수도 있다. -> ?: -> null인 경우 오른쪽 값을 사용한다.
    var number4: Long = number3?.toLong() ?: 0

//    printAgeIfPersonNPE(null) // NPE 발생!
    printAgeIfPersonNull(Person("", 100))

    val person = Person("이지훈", 25)
    println("이름 : ${person.name}, 나이 : ${person.age}") // 이름 : 이지훈, 나이 : 25

    val trimIndent = """
        가나다
        라마바
        개편하넹
        가독성 좋다
        ${person.name}
    """.trimIndent()
    println("trimIndent = ${trimIndent}")

    val str = "ABCD"
    println(str[0]) // A
    println(str[1]) // C
}

fun printAgeIfPerson(obj: Any){
    if(obj !is Person) { // is는 instanceOf obj가 Person이거나 Person의 자손인지 확인
        val person = obj as Person // as Person == (Person) obj -> 생략 가능!
        println(person.age)
        // 아래처럼 축약 가능
        println(obj.age) // Smart cast to javaToKotlin.chapter01.Perso
    }
}
// null이 들어올수 있는 형변환 BUT NPE가 뜨는 경우
fun printAgeIfPersonNPE(obj: Any?){
    // null 관련 아무런 체크가 없는 상태
    val person = obj as Person; // 현재 상태라면 Null이 들어오게 되고 NPE가 뜬다.
    println(person.age)
}

fun printAgeIfPersonNull(obj: Any?) {
    val person = obj as? Person; // obj가 null인 경우 safe call 처럼 전체가 null이 된다.
    println(person?.age) // null이 들어올수도 있기 때문에 변수명?. 으로 시작
}