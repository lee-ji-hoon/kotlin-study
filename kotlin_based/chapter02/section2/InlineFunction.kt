package chapter02.section2

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit){ // crossinline을 사용하면 의도지 않은 return으로 인한 종료를 방지한다.
    println("Hello")
    out(a)
    println("Goodbye")
}

fun main() {
//    shortFunc(10) { a -> println("a: $a") }
    // 단축 가능 단 it사용해야 함
    shortFunc(10) {
        println("a: $it")
//        return // out과 shortFunc 까지 전부 종료되기 때문에 주의해야 한다.
    }
}