package pattern.factory

private const val IPHONE = "IPHONE"
private const val ANDROID = "ANDROID"

/* FactoryMethod
interface PhoneFactory {
    fun orderPhone(): Phone {
        val phone = createPhone()
        phone.complete()
        return phone
    }

    fun createPhone(): Phone
}

class IPhoneFactory : PhoneFactory {
    override fun createPhone(): Phone {
        return IPhone()
    }
}

class AndroidPhoneFactory : PhoneFactory {
    override fun createPhone(): Phone {
        return AndroidPhone()
    }
}

fun main() {
    val androidPhoneFactory = AndroidPhoneFactory()
    val phone = androidPhoneFactory.orderPhone()
    phone.call()
}
*/
