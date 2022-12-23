package pattern.factory

class AndroidPhone : Phone {
    override fun complete() {
        println("안드로이드폰 완성")
    }

    override fun call() {
        println("안드로이드폰으로 전화를 한다")
    }
}