import java.math.BigInteger

//尾递归演示
//用来计算阶乘 2的阶加 2+1  3的阶乘 3+2+1


fun main() {
    println(ollAdd(100000))
}

fun ollAdd(num: Int): Int {
    print("第 $num 次")

    if (num == 1) {
        return 1

    } else {
        return num + ollAdd(num - 1)
    }
}


