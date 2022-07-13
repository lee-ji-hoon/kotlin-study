package chapter02.section1

//fun normalVarargs(a: Int, b : Int, c: Int ....) // a~z까지 인자를 받고자할때 너무 비효율적으로 코드가 길어진다!
fun normalVarargs(vararg  a : Int){ // 모든 인자 받기 위해서는 vararg
    for(num in a)
        print (" $num")
    println()
}

fun main() {
    normalVarargs(1)
    normalVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6)
}