package javaToKotlin.chapter03.section01

fun main() {
    // 1. 클래스와 프로퍼티
    var person = Person(name = "이지훈", age = 25)
    println("person.name = ${person.name}") // 이지훈
    person.age = 20
    println("person.age = ${person.age}") // 20

    var person2 = JavaPerson("최태현", 100)
    println("person2.age = ${person2.age}")
    println("person2.name = ${person2.name}")

    var person3 = Person("이지훈")
    Person() // 초기화 -> 첫번째 -> 두번째

    println(person.isAdult)
}

class Person ( // 생성자 코드는 클래스에 들어간다!
    name: String = "이지훈",
    var age: Int = 1
) {
    var name = name
        set(value){
            field = value.uppercase()
        }
    /*val name = name
        get() { // name대신 field가 들어와야만 한다.
            return field.uppercase()
        }*/

//    fun getUppercaseName(): String{
//        return name.uppercase()
//    }

//    val uppercaseName: String
//        get() = this.name.uppercase()

    // 2. 생성자와 init
    // 클래스가 초기화 되는 시점에 1번 실행된다. 주로 값을 적절히 만들어주거나, valid하는 로직!
    init{
        if(age <=0)
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        println("초기화 블록")
    }

    // 3. 커스텀 getter setter
//    fun isAdult(): Boolean{
//        return this.age >= 20
//    }
    val isAdult: Boolean // 함수 대신 프로퍼티로 만들수도 있다.
        get() = this.age >= 20

    // 최초로 태어나는 아기는 무조건 1살이니, 생성자를 하나 더 만들자!
    constructor(name: String): this(name, 1){
        println("첫 번째 주 생성자")
    }
    // 최종적으로 주생성자를 this로 호출해야만 한다.
    constructor(): this("홍길동") {// 바로 위 constructor 그 뒤 주생성자를 호출하게 된다.
        println("두 번째 주 생성자")
    }
}
class Student()






