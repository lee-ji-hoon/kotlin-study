package javaToKotlin.chapter03.section02.kt

class Penguin (
    species: String,
) : Animal(species, 2), Swimable, Flayble { // 추가로 구현을 넣을때는 : 뒤에 쉼표쓰고 넣으면 됨
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다.")
    }

    // Animal의 프로퍼티에 접근해서 override 해주기 위해서는 해당 프로퍼티에 open을 붙여줘야만 한다.
    override val legCount: Int
        get() = this.wingCount + super.legCount

    override fun act() {
        super<Swimable>.act() // 인터페이스를 특정할 때는 super<타입>.행동()
        super<Flayble>.act()
    }

    override val swimAbility: Int
        get() = 3
}