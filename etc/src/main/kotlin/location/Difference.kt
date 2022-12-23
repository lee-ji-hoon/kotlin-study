package location

import kotlin.math.floor

fun main() {
    val latitude = 37.282778
    val longitude = 127.110515

    println("[latitude 결과]")
    getLocationToMinute(latitude)
    println()
    println("[longitude 결과]")
    getLocationToMinute(longitude)
}

private fun getLocationToMinute(value: Double) {
    val getDo = floor(value).toInt()
    val getMinute = floor((value - getDo) * 60).toInt()
    val getSeconds = floor((((value - getDo) * 60) - getMinute) * 60).toInt()

    println("$getDo $getMinute $getSeconds")

    getLifting(getMinute)
    getDepression(getMinute)
    getLifting(getSeconds)
    getDepression(getSeconds)
}

private fun getLifting(value: Int) {
    val liftingResult = (value + 9) / 10 * 10
    println("lift -> $liftingResult")
}

private fun getDepression(value: Int) {
    val depressionResult = value - value % 10
    println("depression -> $depressionResult")
}

// 1. 도분초 -> 좌표 (도)
// 36°10'09.91" - 36도 10분 9.91초를 변환해보자
// 1) 정수자리는 그냥 도를 그대로 가져온다. 36도
// 2) 소수자리는 다음과 같이 계산한다. (분/60)+(초/3600)
// 계산 결과 36+((10/60)+(9.91/3600)) = 36.16941944

// 2. 좌표 (도) -> 도분초
// 도 = INT(좌표)
// 분 = INT((좌표 - 도) * 60)
// 초 = ((좌표 - 도) * 60 - 분 ) * 60
// *위 INT(x) 는 소수점 버림을 의미합니다.

// 36.16941944를 계산한 경우 계산 결과
// 도 = 36°
// 분 = INT( 0.16941944 * 60) = INT(10.1651664) = 10'
// 초 = (0.16941944 * 60 - 10) * 60 = (10.1651664 - 10) * 60 = 0.1651664 * 60 = 9.909984" = 약 9.91"
