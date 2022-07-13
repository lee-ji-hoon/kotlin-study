package chapter02.section1

fun highFunc(sum : (Int, Int) -> Int, a: Int, b:Int): Int = sum(a, b) // sum 매개변수는 함수

fun main() {
    val result = highFunc({x , y -> x + y}, 10, 20) // 람다식 함수를 인자로 넘김
    print(result)
}
