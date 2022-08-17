package section03.screen

import section03.LINE_DIVIDER
import section03.data.CartItems
import section03.extensions.getNotEmptyInt
import section03.extensions.getNotEmptyString

class ShoppingCart : Screen() {
    private val products = CartItems.products
    fun showCart() {
        ScreenStack.push(this)
        if (products.isNotEmpty()) {
            println(products.keys.joinToString(
                separator = ", \n", prefix = """
                    ${LINE_DIVIDER}
                    장바구니에 담은 상품 목록입니다.
                    
                    """.trimIndent()
            ) { product ->
                "카테고리 : ${product.category} / 상품명 : ${product.name} / 수량 : ${products[product]} / 1개 가격 : ${product.price}"
            })
        } else {
            println(
                """
                장바구니에 담긴 상품이 없습니다.
            """.trimIndent()
            )
        }
        showPreviousScreenOption()
    }

    private fun showPreviousScreenOption() {
        println(
            """
            ${LINE_DIVIDER}
            이전 화면으로 돌아가시겠습니까? (y/n)
            """.trimIndent()
        )
        when (readln().getNotEmptyString()) {
            "y", "Y" -> moveToPreviousScreen()
            "n", "N" -> showCart()
            else -> {}
        }
    }

    private fun moveToPreviousScreen() {
        ScreenStack.pop()
        when (val previousScreen = ScreenStack.peek()){
            is ShoppingCategory -> previousScreen.showCategory()
            is ShoppingProductList -> previousScreen.showProducts()
            is ShoppingCart, is ShoppingMainHome -> {
                // 아무것도 하지 않는다.
            }
        }

    }
}