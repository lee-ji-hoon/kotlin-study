package sort

class BubbleSort : Sort {

    override fun sort(arr: IntArray) {
        sortBubble(arr, arr.size - 1)
    }

    private fun sortBubble(arr: IntArray, end: Int) {
        if (end < 0) return

        for (i in 1..end) {
            if (arr[i] < arr[i - 1]) {
                swap(arr, i - 1, i)
            }
        }
        sortBubble(arr, end - 1)
    }
}
