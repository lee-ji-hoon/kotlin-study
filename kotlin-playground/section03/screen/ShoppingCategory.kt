package section03.screen

import day17.input
import section03.LINE_DIVIDER
import section03.data.Category
import section03.data.Category.*
import section03.extensions.getNotEmptyString

class ShoppingCategory : Screen() {
    private val shoppingCartList = ShoppingCart()
    fun showCategory() {
        ScreenStack.push(this)
        println(
            """
                ${LINE_DIVIDER}
                원하시는 카테고리를 입력해주세요.
                ${LINE_DIVIDER}
                """.trimIndent()
        )
        for (value in Category.values())
            if (value.toString() != "#") println(value.toString())
        println("${LINE_DIVIDER}")
        choiceCategory()
    }

    fun choiceCategory() {
        println("-> 장바구니로 이동하시려면 #을 입력해주세요.")
        while (true) {
            val inputCategory = readLine().getNotEmptyString()
            when (inputCategory) {
                DEVICES.koreanName -> ShoppingProductList(DEVICES).showProducts()
                PASSION.koreanName -> ShoppingProductList(PASSION).showProducts()
                PET_SUPPLIES.koreanName -> ShoppingProductList(PET_SUPPLIES).showProducts()
                CART.koreanName -> shoppingCartList.showCart()
                else -> {
                    println("존재하지 않는 카테고리를 입력했습니다. 입력값 -> ${inputCategory}")
                    showCategory()
                }
            }
        }
    }
}