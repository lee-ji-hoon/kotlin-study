package chapter02.section2

fun main() {
    twoLambda({a, b -> "First $a, $b"}, {"Second $it"})
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String){
    println(first("One", "Two"))
    println(second("One"))
}