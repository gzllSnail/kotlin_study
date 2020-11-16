/**
 * ? 可以为空
 * !! 不能为空
 */

fun main() {

    while (true) {
        println("欢迎使用加法计算器！！！！！")
        println("请输入第一个数字")
        var num1 = readLine()
        println("请输入第二个数字")
        var num2 = readLine()

        try {
            var n1 = num1!!.toInt()
            var n2 = num2!!.toInt()

            println("两数相加：${n1 + n2}")
        } catch (e: Exception) {
            println("输入错误,当个人")
        }
    }


}