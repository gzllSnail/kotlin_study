/**
 * 日记生成
 */
fun main() {
    val diary = diary("中山公园")
    println(diary)
}

fun diary(placeName: String): String {
    return "今天天气晴朗， 万里无云，我们去 $placeName 玩了${placeName.length} 小时"
}