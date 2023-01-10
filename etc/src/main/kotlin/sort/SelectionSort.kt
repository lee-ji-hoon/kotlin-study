package sort

class SelectionSort : Sort {

    override fun sort(arr: IntArray) {
        sortSelection(arr, 0)
    }

    private fun sortSelection(arr: IntArray, start: Int) {
        if (start >= arr.size) return
        var minIndex = start
        for (i in start + 1 until arr.size) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i
            }
        }
        swap(arr, start, minIndex)
        sortSelection(arr, start + 1)
    }
}
