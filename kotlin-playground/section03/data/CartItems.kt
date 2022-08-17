package section03.data

object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts

    fun addProduct(product: Product){
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: run {
            mutableProducts[product] = 1
        }
    }
}