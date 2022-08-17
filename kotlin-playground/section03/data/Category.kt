package section03.data

enum class Category(
    val koreanName: String
) {
    PASSION("패션"),
    DEVICES("전자기기"),
    PET_SUPPLIES("반려동물용품"),
    CART("#");
    override fun toString() = koreanName
}