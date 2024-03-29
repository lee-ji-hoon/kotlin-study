package section03.screen

import section03.LINE_DIVIDER
import section03.data.CartItems
import section03.data.Category
import section03.data.Category.*
import section03.data.Product
import section03.extensions.getNotEmptyInt
import section03.extensions.getNotEmptyString

class ShoppingProductList(private val category: Category) : Screen() {
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

    fun showProducts() {
        ScreenStack.push(this)
        val productsWithCategory = categories.get(category.koreanName)
        println(
            """
                ${LINE_DIVIDER}
                선택하신 [${category.koreanName}] 카테고리 상품입니다.
                ${LINE_DIVIDER}
            """.trimIndent()
        )
        if (!productsWithCategory.isNullOrEmpty()) {
            for ((index, product) in productsWithCategory.withIndex()) {
                println("${index}. ${product}")
            }
            showCartOption(productsWithCategory)
        } else showEmptyProductMessage(category)
    }

    private fun showCartOption(productsWithCategory: List<Product>) {
        println(
            """
            ${LINE_DIVIDER}
            장바구니에 담을 상품 번호를 선택해주세요.
            """.trimIndent()
        )

        val selectedIndex = readLine().getNotEmptyInt()
        productsWithCategory.getOrNull(selectedIndex)?.let { product ->
            CartItems.addProduct(product)
            println("=> 장바구니로 이동하시려면 #을 계속 쇼핑하시려면 *을 눌러주세요..")
            val answer = readLine().getNotEmptyString()
            when (answer) {
                "#" -> ShoppingCart().showCart()
                "*" -> showProducts()
                else -> {}
            }
        } ?: kotlin.run {
            println("${selectedIndex}번은 목록에 없는 상품 번호 입니다. 다시 입력해주세요.")
            showProducts()
        }
    }

    private fun showEmptyProductMessage(category: Category) {
        println("존재하지 않는 카테고리를 입력했습니다 입력한 카테고리 -> ${category}")
    }
}