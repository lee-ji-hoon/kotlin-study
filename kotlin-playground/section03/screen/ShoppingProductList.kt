package section03.screen

import section03.data.Category
import section03.data.Category.*
import section03.data.Product

object ShoppingProductList {
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
        val productsWithCategory = categories.get(category.koreanName) ?: throw Exception("존재하지 않는 카테고리 입니다.")
        println("""
                =====================================
                선택하신 [${category.koreanName}] 카테고리 상품입니다.
                =====================================
            """.trimIndent())
        for ((index, product) in productsWithCategory.withIndex()) {
            println("${index}. ${product}")
        }
    }
}