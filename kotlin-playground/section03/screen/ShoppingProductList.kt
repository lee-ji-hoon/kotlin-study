package section03.screen

import section03.data.Category
import section03.data.Category.*
import section03.data.Product

private val jacket = Product(PASSION, "자켓", 10_000)
private val padding = Product(PASSION, "패딩", 100_000)
private val monitor = Product(DEVICES, "모니터", 150_000)
private val phone = Product(DEVICES, "휴대폰", 21_0000)
private val catPole = Product(PET_SUPPLIES, "캣폴", 21_0000)
private val rat = Product(PET_SUPPLIES, "쥐돌이", 21_0000)

private val productList = mutableMapOf<Category, ArrayList<Product>>().apply {
    this.put(PASSION, arrayListOf<Product>(jacket, padding))
    this.put(DEVICES, arrayListOf<Product>(monitor, phone))
    this.put(PET_SUPPLIES, arrayListOf<Product>(rat, catPole))
}

class ShoppingProductList {
    fun showProducts(category: Category) {
        val productsWithCategory = productList.get(category) ?: throw Exception("존재하지 않는 카테고리 입니다.")
        for (product in productsWithCategory) {
            println(product)
        }
    }
}