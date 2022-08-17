package `kotlin-playground`.section02

fun main() {
    val brandName = "Shoppi"
    val greetings = """
        안녕하세요, ${brandName} 에 오신 것을 환영합니다! 
        쇼핑을 계속 하시려면 이름을 입력해주세요 :)
        """.trimIndent()
    println(greetings)

    try {
        val nickname: String = readLine() ?: throw Exception("이름이 입력되지 않았습니다.")
        println("""
            감사합니다. 반값습니다, ${nickname} 님
            원하시는 카테고리를 입력해주세요.
            =====================================
            """.trimIndent())
    } catch (e: Exception) {
        e.printStackTrace()
    }
}