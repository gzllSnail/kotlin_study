/**
 * ? 可以为空
 * !! 不能为空
 */

fun main() {

    println("请输入第一个数字")
    var num1 = readLine()
    println("请输入第二个数字")
    var num2 = readLine()


    var n1 = num1!!.toInt()
    var n2 = num2!!.toInt()

    println("两数相加：${n1 + n2}")


}