import java.awt.PrintGraphics

/**
 * 变量的处置范围
 */

fun main() {

    val aByte = Byte.MAX_VALUE
    val bByte = Byte.MIN_VALUE
    println("Byte  最大：" + aByte + "最小：" + bByte)

    val aShort = Short.MAX_VALUE
    val bShort = Short.MIN_VALUE
    println("Short  最大：" + aShort + "最小：" + bShort)

    val aInt = Int.MAX_VALUE
    val bInt = Int.MIN_VALUE
    println("Int  最大：" + aInt + "最小：" + bInt)

    val aLong = Long.MAX_VALUE
    val bLong = Long.MAX_VALUE
    println("Long  最大：" + aLong + "最小：" + bLong)

    val aFloat = Float.MAX_VALUE
    val bFloat = Float.MAX_VALUE
    println("Float  最大：" + aFloat + "最小：" + bFloat)

    val aDouble = Double.MAX_VALUE
    val bDouble = Double.MAX_VALUE
    println("Double  最大：" + aDouble + "最小：" + bDouble)

    val aChar = Char.MAX_VALUE
    val bChar = Char.MIN_VALUE
    println("Char  最大：" + aChar + "最小：" + bChar)


    val  cInt = 0b0011
    println("cInt 的值是:$cInt")


}