package etc

fun main() {
    println(fibo1(20))
    printFiboLoop(20)
}

fun printFiboLoop(size: Int) {
    val arr = IntArray(size)
    arr[0] = 1
    arr[1] = 1

    for (i in 2 until size) {
        arr[i] = arr[i - 1] + arr[i - 2]
    }
    println(arr.contentToString())
}

fun fibo1(i: Int): Int {
    return if (i <= 2) {
        1
    } else {
        fibo1(i - 1) + fibo1(i - 2)
    }
}

private fun loopFibonacci(index: Int): Int {
    var answer = 1
    var before = 1
    var temp: Int
    for (i in 2 until index) {
        temp = answer
        answer += before
        before = temp
    }
    return answer
}

private fun recursiveFibonacci(index: Int): Int {
    return if (index <= 2) {
        1
    } else recursiveFibonacci(index - 1) + recursiveFibonacci(index - 2)
}
