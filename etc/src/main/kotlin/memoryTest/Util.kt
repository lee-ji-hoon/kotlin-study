package heapTest

object Util {
    const val max = 5_000_000
    private val rt: Runtime = Runtime.getRuntime()

    fun printHeap(idx: Int) {
        rt.gc()
        val total = rt.totalMemory() // 메모리 총 합
        val free = rt.freeMemory() // 사용 가능한 메모리
        val used = total - free // 사용 중인 메모리는 전체에서 사용가능한 메모리를 뺀 값
        println(String.format("%d Heap:%, 8d bytes", idx, used))
    }
}
