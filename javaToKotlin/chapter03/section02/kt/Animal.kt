package javaToKotlin.chapter03.section02.kt

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}