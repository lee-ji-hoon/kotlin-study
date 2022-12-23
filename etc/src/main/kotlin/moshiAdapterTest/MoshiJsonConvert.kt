package moshiAdapterTest


import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.lang.reflect.ParameterizedType

open class Base(val number: Int)

class SimpleChild(val item: String) : Base(1)
class DynamicChild(val item: String, number: Int) : Base(1)

fun main() {
    val simpleChild = SimpleChild("안녕하세요")
    val dynamicChild = DynamicChild("안녕하세요", 2)

    val baseItems = listOf (simpleChild, dynamicChild)

    val moshi: Moshi =
        Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    val type: ParameterizedType = Types.newParameterizedType(
        List::class.java, SimpleChild::class.java, DynamicChild::class.java) // 자식 정보를 추가로 넣어줬습니다.
    val adaptorList: JsonAdapter<List<Base>> = moshi.adapter(type)

    println("List Children ${adaptorList.toJson(baseItems)}") // List Children [{"number":1},{"number":1}]
}