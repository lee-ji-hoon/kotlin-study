package section03

import section03.category.*

enum class category(
    val koreanName: String
) {
    PASSION("패션"),
    DEVICES("전자기기"),
    PET_SUPPLIES("반려동물용품"),
    CART("#");
    override fun toString() = koreanName
}


val shoppingCart = mutableMapOf<category, Int>()

fun main() {
    val brandName = "Shoppi"
    val greetings = """
        안녕하세요, ${brandName} 에 오신 것을 환영합니다! 
        쇼핑을 계속 하시려면 이름을 입력해주세요 :)
        """.trimIndent()
    println(greetings)
    try {
        val nickname: String? = readLine()
        if (nickname.isNullOrEmpty()) throw Exception("이름이 입력되지 않았습니다.")
        println("감사합니다. 반값습니다, ${nickname} 님")
        showCategory()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun showCategory() {
    println("""
        =====================================
        원하시는 카테고리를 입력해주세요.
        =====================================
    """.trimIndent())
    for (value in values())
        if (value.toString() != "#") println(value.toString())
    println("=====================================")
    choiceCategory()
}

fun choiceCategory() {
    println("-> 장바구니로 이동하시려면 #을 입력해주세요.")
    while (true) {
        val inputProduct = readln()
        when (inputProduct) {
            DEVICES.koreanName -> shoppingCart.put(DEVICES, shoppingCart.getOrDefault(DEVICES, 0) + 1)
            PASSION.koreanName -> shoppingCart.put(PASSION, shoppingCart.getOrDefault(PASSION, 0) + 1)
            PET_SUPPLIES.koreanName -> shoppingCart.put(PET_SUPPLIES, shoppingCart.getOrDefault(PET_SUPPLIES, 0) + 1)
            CART.koreanName -> cart()
            else -> {
                println("존재하지 않는 카테고리를 입력했습니다. 입력값 -> ${inputProduct}")
                showCategory()
            }
        }
    }
}

fun cart() {
    for ((choice, count) in shoppingCart)
        println("${choice.koreanName}이 ${count}개 담겨져 있습니다.")
}
