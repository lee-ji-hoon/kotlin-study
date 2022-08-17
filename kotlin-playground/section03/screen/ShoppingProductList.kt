package section03.screen

import section03.data.CartItems
import section03.data.Category
import section03.data.Category.*
import section03.data.Product

object ShoppingProductList {
    private val shoppingCategory = ShoppingCategory()
    private val jacket = Product(PASSION, "자켓", 10_000)
    private val padding = Product(PASSION, "패딩", 100_000)
    private val monitor = Product(DEVICES, "모니터", 150_000)
    private val phone = Product(DEVICES, "휴대폰", 21_0000)
    private val catPole = Product(PET_SUPPLIES, "캣폴", 21_0000)
    private val rat = Product(PET_SUPPLIES, "쥐돌이", 21_0000)
    
    private val products = arrayOf(jacket, padding, monitor, phone, catPole, rat)
    private val categories: Map<String, List<Product>> = products.groupBy { product ->
        product.category.koreanName
    }


    fun showProducts(category: Category) {
        val productsWithCategory = categories.get(category.koreanName)
        println("""
                =====================================
                선택하신 [${category.koreanName}] 카테고리 상품입니다.
                =====================================
            """.trimIndent())
        if (!productsWithCategory.isNullOrEmpty()) {
            for ((index, product) in productsWithCategory.withIndex()) {
                println("${index}. ${product}")
            }
            showCartOption(productsWithCategory, category)
        } else showEmptyProductMessage(category)
    }

    private fun showCartOption(productsWithCategory: List<Product>, category: Category) {
        println(
            """
            ***====================================
            장바구니에 담을 상품 번호를 선택해주세요.
            """.trimIndent()
        )

        val selectedIndex = readln().toInt()
        productsWithCategory.getOrNull(selectedIndex)?.let { product ->
            CartItems.addProduct(product)
            println("=> 장바구니로 이동하시려면 #을 계속 쇼핑하시려면 *을 눌러주세요..")
            val answer = readln()
            when(answer) {
                "#" -> ShoppingCart().showCart()
                "*" -> showProducts(category)
                else -> {}
            }
        }
    }

    private fun showEmptyProductMessage(category: Category) {
        println("존재하지 않는 카테고리를 입력했습니다 입력한 카테고리 -> ${category}")
        shoppingCategory.showCategory()
    }
}