package inline

inline fun someMethodInline(a: Int, func: () -> Unit): Int {
    func()
    return 2 * a
}

fun main() {
    val result = someMethodInline(2) { println("Just some dummy function") }
    println(result)
}