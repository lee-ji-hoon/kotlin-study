package etc

fun main() {
    val str = "  str str str   ".trim()
    println("$str, ${str.length}")
}

fun String.trim(): CharSequence {
    var start = 0
    var end = length - 1
    var startFound = false

    while (start <= end) {
        val index = if (startFound.not()) start else end
        val match = this[index] == ' '
        if (startFound.not()) {
            if (match) {
                start++
            } else {
                startFound = true
            }
        } else {
            if (match.not()) {
                break
            } else {
                end--
            }
        }
    }
    return this.subSequence(start, end + 1)
}
