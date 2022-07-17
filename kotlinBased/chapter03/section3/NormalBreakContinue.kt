package chapter02.chapter03.section3

fun main() {
    for (i in 1..5){
        if(i==3)
            continue
        print(" $i ") // 1 2 4 5 출력
    }
    println()
    println("outside")
}