package chapter02.section2

fun main() {
    val source = "Hello World!"
    var target = "Kotlin"
    println(source.getLongString(target))
}

// String을 확장해 getLongString 추가
fun String.getLongString(target: String) : String =
    if(this.length > target.length)  this
    else target
