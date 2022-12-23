package pattern.strategy

data class Rider(
    var name: String,
    private var goToWorkStrategy: WorkStrategy,
    private var deliveryStrategy: DeliveryStrategy
) {

    // 추후 변경이 생기면 전략을 갈아 끼운다
    fun changeWorkStrategy(goToWorkStrategy: WorkStrategy) {
        this.goToWorkStrategy = goToWorkStrategy
    }

    fun changeDeliveryStrategy(deliveryStrategy: DeliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy
    }

    // 로직의 일부를 패턴화한 전략을 사용한다.
    fun goToWork() {
        goToWorkStrategy.goToBy() // 출근 시 이동수단 전략을 사용한다.
    }

    fun goToDelivery() {
        deliveryStrategy.move() // 배달시 이동수단 전략을 사용한다.
    }
}
