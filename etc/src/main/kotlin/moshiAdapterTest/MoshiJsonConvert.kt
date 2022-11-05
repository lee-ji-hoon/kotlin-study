package moshiAdapterTest

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.lang.reflect.ParameterizedType

sealed interface BaseSealedTypeInterface {
    val type: BaseType
}

data class FirstChild (
    val strMsg: String
): BaseSealedTypeInterface {
    override val type: BaseType = BaseType.FirstType
}

data class SecondChild(
    val intMsg: Int,
) : BaseSealedTypeInterface  {
    override val type: BaseType = BaseType.SecondType
}

data class ThirdChild (
    val strMsg: String
): BaseSealedTypeInterface {
    override val type: BaseType = BaseType.ThirdType
}

enum class BaseType {
    FirstType,
    SecondType,
    ThirdType
}

fun process() {
    val moshi: Moshi = Moshi.Builder()
        .add(
            PolymorphicJsonAdapterFactory.of(
                BaseSealedTypeInterface::class.java, "type")
                .withSubtype(
                    FirstChild::class.java, BaseType.FirstType.name)
                .withSubtype(
                    SecondChild::class.java, BaseType.SecondType.name)
                .withSubtype(
                    ThirdChild::class.java, BaseType.ThirdType.name))
        .add(KotlinJsonAdapterFactory()).build()

    val type: ParameterizedType = Types.newParameterizedType(
        List::class.java, BaseSealedTypeInterface::class.java)
    val adaptorList: JsonAdapter<List<BaseSealedTypeInterface>> =
        moshi.adapter(type)

    val firstChild = FirstChild("첫번째")
    val secondChild = SecondChild(2)
    val thirdChild = ThirdChild("세번째")

    val baseItems = listOf(firstChild, secondChild, thirdChild)

    println("list ${adaptorList.toJson(baseItems)}")
}

fun main() {
    process()
}
