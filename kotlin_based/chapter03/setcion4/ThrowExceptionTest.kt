package chapter02.chapter03.setcion4

fun main() {
    var amount = 600
    try {
        amount -= 100
        checkAmount(amount)
    } catch (e : Exception){ // checkAmount 에서 throw로 예외를 발생시켰을때? 여기가 실행이 될까?
        println(e.message) // Exception에 지정한 message가 뜨게 된다.
    }
    println("amount : $amount")
}

fun checkAmount(amount : Int){
    if(amount < 1000)
        throw Exception("잔고가 $amount 으로 1000이하입니다.")
}