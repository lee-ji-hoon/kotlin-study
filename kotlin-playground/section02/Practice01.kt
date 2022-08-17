package `kotlin-playground`.section02

fun main() {
    // 1. 브랜드명 지정
    val brandName = "Shoppi"

    // 2. 인사말 출력
    val greetings = """
        안녕하세요, ${brandName} 에 오신 것을 환영합니다! 
        쇼핑을 계속 하시려면 이름을 입력해주세요 :)
        """.trimIndent()
    println(greetings)

    // 3. 이름 입력 받고 출력
    try {
        val nickname: String = readLine() ?: throw Exception("이름이 입력되지 않았습니다.")
        println("감사합니다. 반값습니다, ${nickname} 님")
    // 제대로된 입력이 안들어왔을 경우
    } catch (e: Exception) {
        e.printStackTrace()
    }
}