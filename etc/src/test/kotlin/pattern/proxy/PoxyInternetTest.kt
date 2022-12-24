package pattern.proxy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PoxyInternetTest {

    private lateinit var internet: Internet

    @BeforeEach
    fun setUpInternet() {
        internet = ProxyInternet()
    }

    @Test
    @DisplayName("[성공] 도메인이 올바르게 연결됐을 때")
    fun `밴 돼있지 않은 도메인으로 접근했을 때`() {
        val host = "naver.com"
        assertEquals(internet.connectTo(host), "${host}에 연결 됐습니다.")
    }

    @Test
    @DisplayName("[오류] 도메인이 올바르지 않을 때")
    fun `밴 돼있는 도메인으로 접근했을 때`() {
        val host = "aaa.com"
        assertThrows(IllegalAccessException::class.java) { internet.connectTo(host) }
    }
}
