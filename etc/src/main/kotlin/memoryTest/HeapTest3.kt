package heapTest

/**
 * 메모리단에서 String으로 갖고 있느냐 byte 상태로 갖고 있느냐에 따라서 두 배 정도 차이가 있다.
 * 파일에 데이터를 엑세스하거나 할 때 참고할만한 자료이다!
 */
fun main() {
    Util.printHeap(0)

    var sb: StringBuffer? = StringBuffer(Util.max)
    for (i in 0 until Util.max) {
        sb?.append("a")
    }
    val b = sb.toString().toByteArray()
    sb = null // StringBuffer null 처리해서 gc에서 날라가게 설정
    Util.printHeap(1)
    Util.printHeap(2)

    /**
     0 Heap: 432,120 bytes
     1 Heap: 5,601,936 bytes
     2 Heap: 5,599,440 bytes
     */
}
