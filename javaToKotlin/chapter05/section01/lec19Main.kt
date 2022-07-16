package javaToKotlin.chapter05.section01

import javaToKotlin.chapter04.section04.Fruit
import javaToKotlin.chapter05.section01.a.printHelloWorld as printHelloWorldA
import javaToKotlin.chapter05.section01.b.printHelloWorld as printHelloWorldB


//data class Person(
//    val name: String,
//    val age: Int
//)

class Person(
    val name: String,
    val age: Int
) {
    // componentN은 연산자의 속성을 갖고 있기 때문에 operator을 붙여줘야 한다.
    operator fun component1(): String{
        return this.name
    }
    operator fun component2(): Int{
        return this.age
    }
}

fun main() {
    // 한 파일 내에서 동일한 이름의 함수를 가져올 수 있다!
    printHelloWorldA()
    printHelloWorldB()

    val person = Person("최태현", 100)
    val (name, age) = person
    // data class의 componentN을 자동으로 생성해주는 것일 이용!
//    val name = person.component1() // 1번째 프로퍼티
//    val age = person.component2() // 2번째 프로퍼티
    // 위 두 문장이 생략돼서 아래에 코드 처럼 된 것이다.
//    val(name, age) = person

    println("이름 : ${name}, 나이 : ${age}")
}

// fun filterFruit(fruits: List<Fruit>, filter: (Fruit) -> Boolean){}
// 축약된 생태
fun filterFruit(fruits: List<Fruit>, filter: FruitFilter){}
typealias FruitFilter = (Fruit) -> Boolean // 타입 별칭으로 생략

data class UltraSuperGuardianTride(
    val name: String
)
// 위처럼 이름이 긴 클래스를 컬렉션에 사용할 때도 간단히 줄일 수 있다.
typealias USGTMap = Map<String, UltraSuperGuardianTride>






