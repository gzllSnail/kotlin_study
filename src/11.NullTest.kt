/**
 * null 判断
 *
 * ?  加上可传 null  不加就不能传
 */
fun main() {
    heat("狗")
    heat(null)

}

fun heat(a: String?): String {
    return "热 $a"
}