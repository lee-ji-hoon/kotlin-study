package sealedExample

sealed class Expr

data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun main() {
//    println(System.currentTimeMillis())
    /*val map = hashMapOf<String, Int>()
    val set = hashSetOf<String>()
    for (s in id_list) {
        val split = s.split(" ")
        set.addAll(split)
        for (s in set) {
            val temp = map[s] ?: 0
            map[s] = temp + 1
        }
    }

    var answer = 0
    for ((key, value) in map.entries) {
        answer += if (value >= k) k
        else value
    }
    println(answer)*/
}
