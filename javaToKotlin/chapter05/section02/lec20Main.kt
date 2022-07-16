package javaToKotlin.chapter05.section02

import javaToKotlin.chapter05.section01.Person

fun main() {
    mutableListOf("one", "two", "three")
        .also { println("The list ~~") }
        .add("four")
}

fun printPerson(person: Person?){
    // 위 코드를 리팩토링 해보자
    /*if (person != null) {
        println(person.name)
        println(person.age)
    }*/
    // let을 통해서 Lambda를 사용할 수 있다.
    // let은 scopre function의 한 종류이다.
    person?.let{ persons ->
        println(persons.name)
        println(persons.age)
    }
}