package chapter02.section2

fun main() {
    val sum = 3 sum 5
    println("sum = $sum")

    val strPlus = 3 strPlus "Kotlin"
    println("strPlus = $strPlus")
}

infix fun Int.strPlus(target: String): String{
    return "$target version $this"
}

infix fun Int.sum(x: Int): Int{
    return this + x
}