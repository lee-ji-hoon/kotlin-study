package memoryTest

fun main() {
    Util.printHeap(0)

    // max 사이즈를 지정하니까 조금 줄어드는 모습이다.
    val arr = ArrayList<String>(Util.max + 1)
    for (i in 0 until Util.max) {
        arr.add("a")
    }
    Util.printHeap(1)
    Util.printHeap(2)

    /**
     0 Heap: 432,712 bytes
     1 Heap: 20,601,704 bytes
     2 Heap: 20,599,208 bytes
     */
}
