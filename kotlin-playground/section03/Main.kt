package section03

import section03.screen.ShoppingMainHome
import section03.screen.ShoppingProductList

// 1. main 함수 시작
// 2. 쇼핑 안내 메시지 출력
// 3. 카테고리 출력
// 4. 카테고리 고르기 -> 만약 없는거 골랐을 경우 따로 정의
// 5. # 입력했을때 장바구니 이동 -> 장바구니 출력
fun main() {
    val shoppingMainHome = ShoppingMainHome()
    shoppingMainHome.start()
}