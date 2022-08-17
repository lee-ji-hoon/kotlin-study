package section03.screen

import section03.category

class ShoppingCartList {
    fun showCart(shoppingCart: MutableMap<category, Int>) {
        for ((choice, count) in shoppingCart)
            println("${choice.koreanName}이 ${count}개 담겨져 있습니다.")
    }
}