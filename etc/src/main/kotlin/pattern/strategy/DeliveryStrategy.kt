package pattern.strategy

interface DeliveryStrategy {
    fun move(): String
}

class MotorCycleStrategy : DeliveryStrategy {
    override fun move() = "오토바이"
}

class BikeStrategy : DeliveryStrategy {
    override fun move() = "자전거"
}