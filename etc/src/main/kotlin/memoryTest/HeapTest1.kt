package heapTest

fun main() {
    Util.printHeap(0)

    val sb = StringBuffer()
    for (i in 0..Util.max) {
        sb.append("a")
    }
    Util.printHeap(1)
    Util.printHeap(2)

    /**
     0 Heap: 457,536 bytes
     1 Heap: 19,476,416 bytes
     2 Heap: 19,474,376 bytes
     */
}
