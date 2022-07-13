package chapter02.section1

// 반환값이 없으면 unit
//fun sum(a: Int, b: Int): Int { // 최상위 함수
//    return a + b
//}

//fun max(a: Int, b: Int): Int{
//    return if(a > b) a else b
//}

//fun outfunc(name: String): Unit{ // return이 없는 형태 Unit 생략 가능
//    println("Name : $name")
////    return Unit // 생략돼있음
//}

// 위 코드 3개를 아래처럼 축약이 가능하다.
// 반환값이 추론가능하면 생략 + return 도 생략
fun sum(a: Int, b: Int) = a + b
fun sum2(a: Int, b: Int = 5) = a + b // 만약 b에 아무런 값도 들어오지 않으면 b는 5로 추론!
fun sum3(a: Int = 2, b: Int = 5, c: Int) = a + b + c
fun max(a: Int, b: Int) = if(a > b) a else b
fun outfunc(name: String) = println("Name : $name")

fun main(){ // 최상위 (Top -level) 함수
    val result1 = sum(2, 3)
    println("합 : $result1")
    val a = 2
    val b = 5
    val result2 = max(a, b)
    println("최댓값 : $result2")
    val result3 = sum2(2) // b가 생략돼 있어서 b는 default값으로 선언이 된다.
    println("b는 생략한 sum 값 : $result3")
    val result4 = sum3(c = 3) // a, b는 생략하고 c를 주고 싶을 때 (즉 순서 상관없이 매개변수에 값을 주고 싶을 때)
    println("a(2), b(5)는 기본값 c는 3을 넣었을 때의 합 : $result4")

    outfunc("Lee Ji Hoon")
}
