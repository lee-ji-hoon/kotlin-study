package pattern.factory

class IPhone : Phone {
    override fun complete() {
        println("아이폰 완성")
    }

    override fun call() {
        println("아이폰으로 전화를 한다")
    }
}