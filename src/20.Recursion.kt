import java.math.BigInteger

//递归演示
//用来计算阶乘 2的阶乘 2*1  3的阶乘 3*2*1


fun fact(num: Int): Int {
    if (num == 1) {
        return 1
    } else {
        return num * fact(num - 1)
    }
}

fun fact(num: BigInteger, a: Int): BigInteger {
    if (num == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return num * fact(num - BigInteger.ONE, 0)
    }
}

fun main() {
    println(fact(19))
    println(fact(100))  //100的时候为0 是因为太大了 int类型装不下了
    println(fact(BigInteger("100"), 0))

}


