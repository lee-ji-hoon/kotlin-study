package javaToKotlin.chapter03.section05

fun main() {
}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private val aread: Double
    ) {
        val address: String
            get() = this@House.address
    }
}




