package section03.screen

import section03.data.Category
import section03.data.Category.*

class ShoppingCategory {
    private val shoppingCartList = ShoppingCartList()
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
        val shoppingCart = mutableMapOf<Category, Int>()
        println("-> 장바구니로 이동하시려면 #을 입력해주세요.")
        while (true) {
            val inputCategory = readln()
            when (inputCategory) {
                DEVICES.koreanName -> {
                    shoppingCart.put(DEVICES, shoppingCart.getOrDefault(DEVICES, 0) + 1)
                    shoppingProductList.showProducts(DEVICES)
                }
                PASSION.koreanName -> {
                    shoppingCart.put(PASSION, shoppingCart.getOrDefault(PASSION, 0) + 1)
                    shoppingProductList.showProducts(PASSION)
                }
                PET_SUPPLIES.koreanName -> {
                    shoppingCart.put(PET_SUPPLIES, shoppingCart.getOrDefault(PET_SUPPLIES, 0) + 1)
                    shoppingProductList.showProducts(PET_SUPPLIES)
                }
                CART.koreanName -> {
                    shoppingCartList.showCart(shoppingCart)
                    shoppingProductList.showProducts(CART)
                }
                else -> {
                    println("존재하지 않는 카테고리를 입력했습니다. 입력값 -> ${inputCategory}")
                    showCategory()
                }
            }
        }
    }
}