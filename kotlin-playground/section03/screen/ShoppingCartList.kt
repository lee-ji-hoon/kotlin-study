package section03.screen
import section03.data.Category

class ShoppingCartList {
    fun showCart(shoppingCart: MutableMap<Category, Int>) {
        for ((choice, count) in shoppingCart)
            println("${choice.koreanName}이 ${count}개 담겨져 있습니다.")
    }
}