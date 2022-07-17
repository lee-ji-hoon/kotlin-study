package chapter02.section2

fun main() {
    val number = 7
//    println("Factorial : $number -> ${factorial(number)}")
    println("일반 재귀 : $number -> ${fibo1(number)}")
    println("꼬리 재귀 : $number -> ${fibo2(number)}")
}

//private tailrec fun factorial(n: Int, run: Int = 1): Long{
//    return if(n == 1) run.toLong() else factorial(n- 1, run * n)
//}

// 일반 재귀
fun fibo1(n : Int): Int{
    return if(n == 1 || n == 2) 1 else fibo1(n - 1) + fibo1(n - 2)
}

// 꼬리 재귀
private tailrec fun fibo2(n : Int, first: Int = 0, second: Int = 1): Int{
    return if( n <= 1) second else fibo2(n - 1, second, first + second)
}