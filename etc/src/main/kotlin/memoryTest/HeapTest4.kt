package heapTest

/**
 * StringBuffer보다 훨씬 큰 모습이다.
 * String을 Array에 담기 위해서 부가 정보들이 들어가기 때문에 더 클 수 밖에 없다.
 */
fun main() {
    Util.printHeap(0)

    val arr = ArrayList<String>()
    for (i in 0 until Util.max) {
        arr.add("a")
    }
    Util.printHeap(1)
    Util.printHeap(2)

    /**
     0 Heap: 432,712 bytes
     1 Heap: 25,213,152 bytes
     2 Heap: 25,212,800 bytes
     */
}
