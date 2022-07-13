package chapter02.section2

fun main() {
    val result: Int
    val multi :(a: Int, b: Int ) -> Int = {a, b ->
        println("a : $a, b: $b")  // 해당 내용은 반환되는게 아닌 출력만 됨
        a * b // 마지막줄만 반환이됨!
    }

    val greet = {println("Hello World!")} // () -> Unit 추론 가능
    val square = { x: Int -> x * x } // 선언 부분을 생략하려면 x의 자료형을 명시해야 함
    val nestedLambda = { { println("nested") }} // ()-> ()-> 가 있다고 추론 가능


    result = multi(10, 20)
    print(result)
}
