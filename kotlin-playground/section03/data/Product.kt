package section03.data

data class Product(
    val category: Category,
    val name: String,
    val price: Int
) {
    override fun toString(): String {
        return "제품명: $name, 가격: $price"
    }
}