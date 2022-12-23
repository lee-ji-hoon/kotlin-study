package pattern.strategy

fun main() {
    val bikeStrategy = BikeStrategy()
    val bySubwayStrategy = BySubwayStrategy()
    val motorCycleStrategy = MotorCycleStrategy()

    val rider = Rider("이지훈", bySubwayStrategy, motorCycleStrategy)
    rider.goToWork() // 지하철 타고 출근
    rider.goToDelivery() // 오토바이로 배달
    rider.changeDeliveryStrategy(bikeStrategy) // 자전거배달 전략으로 변경
    rider.goToDelivery() // 자전거로 배달
}
