package memoryTest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"main", "", "etc"})
public final class HeapTest2Kt {
    
    /**
     * a라는 문자열이 1byte라면 현재 예시에서는 5mb 정도 되는 것이다.
     * 자바에서는 String을 유니코드 2byte로 메모리를 갖고 있기 때문에 실제로 메모리에 10mb 정도 차지한다.
     * 그럼 뮤니코드가 2byte면 아스키코드에서는 1byte로 갖고 있을 수 있으니까 byte로 갖고 있어보자.
     */
    public static final void main() {
    }
}