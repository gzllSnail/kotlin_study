import kotlin.math.sqrt

/**
 * boolean 运算
 */
fun main() {
    var num1 = 4
    var num2 = 6

    println(num1 > num2)

    //sqrt 为根号
    var num3 = sqrt(5.0) - sqrt(4.0)
    var num4 = sqrt(4.0) - sqrt(3.0)
    println(num3 > num4)

    //pow 为指数  次方
    var num5 = Math.pow(2.0, 100.0)
    var num6 = Math.pow(3.0, 75.0)
    println(num6 > num5)



}