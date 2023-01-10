package sort

fun main() {
    val intArr = intArrayOf(1, 3, 2, 4, 10, 20, 5, 7, 8, 10, 1000, 241, 23114, 55)
    println("정렬 전 : ${intArr.contentToString()}")
    MergeSort().sortArray(intArr)
    println("정렬 후 : ${intArr.contentToString()}")
}
