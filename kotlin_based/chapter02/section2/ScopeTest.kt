package chapter02.section2

var global = 10

fun main() {

//    localFunc() // localFunc가 뭔데???
    fun localFunc() {
        println("localFunc")
    }
    localFunc() // 문제 없음

    global = 15
    val local = 15 // userFunc에 있는 local 변수의 생명은 다르다.
    println("global = $global") // 15
    userFunc()
    println("final - gloable : $global, local : $local") // 20
}

fun userFunc(){
//    localFunc() // localFunc가 뭔데???
    global = 20
    val local = 20 // main에 있는 local 변수의 생명은 다르다.
    println("userFunc - global : $global, local : $local") // 20
}

fun more(out: (String) -> String) {
    println(out("Hello"))
}

