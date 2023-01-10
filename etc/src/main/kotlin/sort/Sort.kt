package sort

interface Sort {
    fun sort(arr: IntArray)

    fun swap(arr: IntArray, start: Int, target: Int) {
        val temp = arr[start]
        arr[start] = arr[target]
        arr[target] = temp
    }
}
