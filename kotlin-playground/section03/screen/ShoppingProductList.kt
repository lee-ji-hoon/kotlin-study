package section03.screen

import section03.category
import section03.choiceCategory

class ShoppingProductList {
    fun showProducts() {
        println("""
                =====================================
                원하시는 카테고리를 입력해주세요.
                =====================================
                """.trimIndent())
        for (value in category.values())
            if (value.toString() != "#") println(value.toString())
        println("=====================================")
        choiceCategory()
    }
}