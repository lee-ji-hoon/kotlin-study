package chapter02.section2

fun main() {
    // 매개변수가 없는 람다식 함수
    noParam ({ "Hello World"})
    noParam { "Hello World" } // 위와 동일, 소괄호 생략 가능

    // 매개변수가 하나 있는 람다식 함수
    oneParam ({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" } // 위와 동일
    oneParam { "Hello World! $it" } // 위와 동일 결과 it으로 대체 가능

    // 매개변수가 2개 이상인 경우
    moreParam {a, b -> "Hello World! $a $b"} // 매개변수 생략 불가능

    // 인자와 함께 사용하는 경우
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" }
}

// 일반 매개변수 2개를 포함, 람다식 함수를 마지막 매개변수로 가짐
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}

fun moreParam(s: (String, String) -> String){
    println(s("One Param", "Two Param"))
}

// 매개변수가 하나 있는 람다식 함수가 oneParam 함수의 매개변수 s로 저장됨
fun oneParam(s: (String) -> String){
    println(s("One Param"))
}

// 매개변수가 없는 람다식 함수가 noParam 함수의 매개변수 s로 지정됨
fun noParam(s: () -> String){
    println(s())
}