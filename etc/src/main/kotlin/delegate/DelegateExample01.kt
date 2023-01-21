package delegate

interface 부동산계약 {
    val 계약자이름: String
    fun 계약하기()
}

class 본인(val 이름: String) : 부동산계약 {
    override val 계약자이름 = 이름
    override fun 계약하기() {
        println("계약 성공")
    }
}

val me = 본인("lee_ji_hoon")

class 부동산중개인() : 부동산계약 by me // 나의 계약하기 fun이 부동산 중개인에게 위임됨

fun main() {
    부동산중개인().계약하기() // 계약되었습니다.
}
