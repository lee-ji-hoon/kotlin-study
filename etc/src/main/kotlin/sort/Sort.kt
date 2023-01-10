package sort

interface Sort {
    fun sort(arr: IntArray)

    fun swap(arr: IntArray, start: Int, minIndex: Int) {
        val temp = arr[start]
        arr[start] = arr[minIndex]
        arr[minIndex] = temp
    }
}
