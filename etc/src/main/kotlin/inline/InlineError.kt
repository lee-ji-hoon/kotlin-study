package inline

inline fun firstMethod(a: Int, func1: () -> Unit, noinline func2: () -> Unit) {
    func1()
    secondMethod(10, func2)
}

fun secondMethod(a: Int, func: () -> Unit): Int {
    func()
    return 2 * a
}

fun main() {
    firstMethod(2, { println("테스트 fun1") }, { println("테스트 fun2") })
}
