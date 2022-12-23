package pattern.factory

private const val IPHONE = "IPHONE"
private const val ANDROID = "ANDROID"

// 휴대폰을 만드는 공장
class SimplePhoneFactory {
    fun orderPhone(type: String): Phone {
        val phone = createPhone(type)
        phone.complete()
        return phone
    }

    private fun createPhone(type: String): Phone {
        return when (type) {
            IPHONE -> IPhone()
            ANDROID -> AndroidPhone()
            else -> throw Exception("존재하지 않는 휴대폰입니다.")
        }
    }
}

// 클라이언트는 휴대폰 공장에서 휴대폰을 주문한다.
fun main() {
    val simplePhoneFactory = SimplePhoneFactory()
    val phone = simplePhoneFactory.orderPhone(IPHONE)
    phone.call()
}
