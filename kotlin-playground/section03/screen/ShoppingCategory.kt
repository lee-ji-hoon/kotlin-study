package section03.screen

import day17.input
import section03.data.Category
import section03.data.Category.*
import section03.extensions.getNotEmptyString

class ShoppingCategory {
    private val shoppingCartList = ShoppingCart()
    private val shoppingProductList = ShoppingProductList
    fun showCategory() {
        println("""
                =====================================
                원하시는 카테고리를 입력해주세요.
                =====================================
                """.trimIndent())
        for (value in Category.values())
            if (value.toString() != "#") println(value.toString())
        println("=====================================")
        choiceCategory()
    }

    fun choiceCategory() {
        println("-> 장바구니로 이동하시려면 #을 입력해주세요.")
        while (true) {
            val inputCategory = readLine().getNotEmptyString()
            when (inputCategory) {
                DEVICES.koreanName -> shoppingProductList.showProducts(DEVICES)
                PASSION.koreanName -> shoppingProductList.showProducts(PASSION)
                PET_SUPPLIES.koreanName -> shoppingProductList.showProducts(PET_SUPPLIES)
                CART.koreanName -> shoppingCartList.showCart()
                else -> {
                    println("존재하지 않는 카테고리를 입력했습니다. 입력값 -> ${inputCategory}")
                    showCategory()
                }
            }
        }
    }
}