package functionalProgramming

fun highFun(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)

fun main() {
    println(highFun({ x, y -> x + y }, 10, 20))
}
