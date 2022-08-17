package section03.screen
import section03.data.CartItems

class ShoppingCart {
    private val products = CartItems.products
    fun showCart() {
        if(products.isNotEmpty()) {
            println(
                products.keys.joinToString (
                    separator = ", \n",
                    prefix =  """
                    ***======================
                    장바구니에 담은 상품 목록입니다.
                    
                    """.trimIndent()
                ) { product ->
                    "카테고리 : ${product.category} / 상품명 : ${product.name} / 수량 : ${products[product]} / 1개 가격 : ${product.price}"
                }
            )
        } else {
            println("""
                장바구니에 담긴 상품이 없습니다.
            """.trimIndent())
        }
    }
}