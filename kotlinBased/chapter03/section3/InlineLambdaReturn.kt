package chapter02.chapter03.section3

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
}

fun retFunc() {
    println("start of retFunc") // 1
    // 라벨링으로 해결!
//    inlineLambda(13, 3) lit@{ a, b ->
//        val result = a + b // 2
//        if (result > 10)
//            return@lit//  3. 10보다 크면 이 함수를 빠져 나감
//        println("result:  $result") // 4. 10보다 크면 이 문장에 도달하지 못함
//    }
    inlineLambda(13, 3, fun(a, b) { // 익명 함수 사용
        val result = a + b // 2
        if (result > 10)
            return
        println("result:  $result")
    }) // inlineLambda() 함수의 끝
    println("end") // 5
}
