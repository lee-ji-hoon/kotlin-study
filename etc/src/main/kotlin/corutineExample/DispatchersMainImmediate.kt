package corutineExample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun main() {
    CoroutineScope(Dispatchers.Main.immediate).launch {
        println("디스패처 Main 실행")
    }
    println("외부 실행")

}