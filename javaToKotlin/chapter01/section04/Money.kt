package javaToKotlin.chapter01.section04

data class Money(val amount: Long){
    operator fun plus(other: Money): Money{
        return Money(other.amount + this.amount)
    }
}
