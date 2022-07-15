package javaToKotlin.chapter01.section01

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.text.NumberFormat

fun main() {

}

// 1. try catch finally
// 주어진 문자열을 정수로 변경하는 예제
fun parseIntOrThrow(str: String): Int{
    try {
        return str.toInt()
    } catch (e: NumberFormatException){
        // 타입이 뒤에 위치하고 인스턴스를 만들때 new를 만들지 않는다.
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.") // 포맷팅 간결
    }
}

// 주어진 문자열을 정수로 변경하는 예제 -> 실패하면 null 반환!
fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// 2. Checked Exception 과 Unchecked Exception
fun readFile(){ // 자바와는 다르게 throws IOException이 날수도 있더라도 굳이 명시해주지 않아도 된다.
    var currentFile: File = File(".")
    var file: File = File(currentFile.absolutePath + "/a.txt")
    var reader: BufferedReader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}






