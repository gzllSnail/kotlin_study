/**
 * 条件控制
 */
fun main() {
    checkFace(9)
}

fun checkFace(score: Int): Unit {
    if (score >= 80) {
        println("这是一个帅哥")
    } else {
        println("这是一个衰哥")
    }



    println(checkMaxNum(9, 78))
}

fun checkMaxNum(a: Int, b: Int): Int {
    return if (a >= b) {
        a
    } else {
        b
    }
}



