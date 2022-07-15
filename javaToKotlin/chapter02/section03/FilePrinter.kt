package javaToKotlin.chapter02.section03

import java.io.BufferedReader
import java.io.FileReader

class FilePrinter {
    // 3. try with resources
    fun readFile(path: String) {
        // use가 무슨 문법인지는 4단원에서 공부!
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}