package memoryTest

/**
 * a라는 문자열이 1byte라면 현재 예시에서는 5mb 정도 되는 것이다.
 * 자바에서는 String을 유니코드 2byte로 메모리를 갖고 있기 때문에 실제로 메모리에 10mb 정도 차지한다.
 * 그럼 뮤니코드가 2byte면 아스키코드에서는 1byte로 갖고 있을 수 있으니까 byte로 갖고 있어보자.
 */
fun main() {
    Util.printHeap(0)

    // StringBuffer의 경우에는 총 사용량을 지정해주는 것이 효과적이다.
    val sb = StringBuffer(Util.max)
    for (i in 0 until Util.max) {
        sb.append("a")
    }
    Util.printHeap(1)
    Util.printHeap(2)

    /**
     0 Heap: 432,120 bytes
     1 Heap: 10,601,936 bytes
     2 Heap: 10,599,440 bytes
     */
}
