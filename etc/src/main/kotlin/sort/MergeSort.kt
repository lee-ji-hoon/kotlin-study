package sort

class MergeSort {

    fun sortArray(arr: IntArray) {
        val temp = IntArray(arr.size)
        mergeSort(arr, temp, 0, arr.size - 1)
    }

    private fun mergeSort(arr: IntArray, temp: IntArray, start: Int, end: Int) {
        if (start < end) {
            val mid = (start + end) / 2
            mergeSort(arr, temp, start, mid)
            mergeSort(arr, temp, mid + 1, end)
            merge(arr, temp, start, mid, end)
        }
    }

    private fun merge(arr: IntArray, temp: IntArray, start: Int, mid: Int, end: Int) {
        for (i in start..end) {
            temp[i] = arr[i]
        }

        var part1 = start
        var part2 = mid + 1
        var index = start

        while (part1 <= mid && part2 <= end) {
            if (temp[part1] <= temp[part2]) {
                arr[index] = temp[part1]
                part1++
            } else {
                arr[index] = temp[part2]
                part2++
            }
            index++
        }

        for (i in 0..mid - part1) {
            arr[index + i] = temp[part1 + i]
        }
    }

    /*private fun mergeSort(arr: IntArray, temp: IntArray, start: Int, end: Int) {
        if (start < end) {
            val mid = (start + end) / 2
            mergeSort(arr, temp, start, mid)
            mergeSort(arr, temp, mid + 1, end)
            merge(arr, temp, start, mid, end)
        }
    }

    private fun merge(arr: IntArray, temp: IntArray, start: Int, mid: Int, end: Int) {
        for (i in start..end) {
            temp[i] = arr[i]
        }

        var part1 = start
        var part2 = mid + 1
        var index = start

        while (part1 <= mid && part2 <= end) {
            arr[index] = if (temp[part1] <= temp[part2]) {
                temp[part1++]
            } else {
                temp[part2++]
            }
            index++
        }

        for (i in 0..mid - part1) {
            arr[index + i] = temp[part1 + i]
        }
    }*/
}
