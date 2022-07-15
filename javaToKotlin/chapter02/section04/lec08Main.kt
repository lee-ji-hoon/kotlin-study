package javaToKotlin.chapter02.section04

fun main() {
    repeat("Hello", 3, false)
    repeat("Hello", 10)
    repeat("Hello")

    // 3. named argument
    // 3은 그대로 쓰는데 useNewLine만 바꾸고 싶다면?
    repeat("Hello", useNewLine = false) // 직접 명시가 가능하다!

    // 파라미터가 많을 때 같은 타입이면 위치를 잘못 써도 정상 실행이 되기 때문에 버그를 찾기 어렵다!
    printNameAndGender("FEMALE", "최태현")
    printNameAndGender(name = "최태현", gender = "FEMALE") // 빌더를 안쓰는데 빌더 같은 장점이 있다!!
    // 빌더의 경우 실수를 할 확률이 확 줄어든다!
    // .name("최태현")
    // .gender("MALE")

//    Lec08Main.repeat(str = "A", num = 3, useNewLine = boolean) // Named arguments are not allowed for non-Kotlin functions
    printAll("A", "B", "C")
    val array = arrayOf("a", "b", "c")
    printAll(*array) // * = spread 연산자 -> 즉 배열의 내용을 꺼내서 흩뿌려준다는 의미!

}
// 1. 함수 선언 방법
fun max(a: Int, b: Int) = if (a > b) b else a

// 2. default paramter
// useNewLine이 보통 true인 경우 아래 처럼 기본 할당이 가능하다!
// num도 3이라면?!
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for(i in 1..num)
        if(useNewLine)
            println(str)
        else
            println(str)
}

// 3. named argument
fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// 4. 같은 타입의 여러 파라미터 받기
// 문자열을 N개 받아 출력하는 예제
fun printAll(vararg strings: String) {
    for (str in strings)
        println(str)
}





