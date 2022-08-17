package section03.screen

import section03.category
import section03.showCategory

class ShoppingCategory {
    private val shoppingCartList = ShoppingCartList()
    fun choiceCategory() {
        val shoppingCart = mutableMapOf<category, Int>()
        println("-> 장바구니로 이동하시려면 #을 입력해주세요.")
        while (true) {
            val inputProduct = readln()
            when (inputProduct) {
                category.DEVICES.koreanName -> shoppingCart.put(category.DEVICES, shoppingCart.getOrDefault(category.DEVICES, 0) + 1)
                category.PASSION.koreanName -> shoppingCart.put(category.PASSION, shoppingCart.getOrDefault(category.PASSION, 0) + 1)
                category.PET_SUPPLIES.koreanName -> shoppingCart.put(
                    category.PET_SUPPLIES, shoppingCart.getOrDefault(
                        category.PET_SUPPLIES, 0) + 1)
                category.CART.koreanName -> shoppingCartList.showCart(shoppingCart)
                else -> {
                    println("존재하지 않는 카테고리를 입력했습니다. 입력값 -> ${inputProduct}")
                    showCategory()
                }
            }
        }
    }
}