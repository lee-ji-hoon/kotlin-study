package section03.extensions

fun String?.getNotEmptyString(): String {
    var input = this
    while (input.isNullOrBlank()) {
        println("값을 입력해주세요.")
        input = readln()
    }
    return input.trim()
}

fun String?.getNotEmptyInt(): Int {
    var input = this?.trim()
    while (input.isNullOrEmpty() || input.toIntOrNull() == null) {
        println("값을 입력해주세요.")
        input = readln()
    }
    return input.toInt()
}