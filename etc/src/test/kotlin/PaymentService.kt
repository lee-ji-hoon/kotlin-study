interface PaymentService {
    fun pay(): PayResult
}

data class PayResult(
    val codes: List<String>
)

class OrderService(
    private val paymentService: PaymentService
) {
    fun order() {
        paymentService.pay()
    }
}