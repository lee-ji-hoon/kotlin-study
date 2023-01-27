package inline

fun someMethod(a: Int, func: () -> Unit): Int {
    func()
    return 2 * a
}

fun main() {
    val result = someMethod(2) { println("Just some dummy function") }
    println(result)
}
