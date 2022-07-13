fun main() {
    val username: String = "JiHoon"
//    username = "Dooly" // 에러 발생 val로 선언된 username이기 때문!
    var username2: String = "Ezhoon"
    username2 = "Dooly"

    var count = 3 // 데이터 타입 추론으로 인해 Int를 적지 않아도 Int로 추론을 한다.

    println("username : ${username}")
    println("username : $username2, count : $count") // 변수 하나만 출력인 경우 {} 생략 가능
}