/**
 * when  表达式判断
 */

fun main() {
    gradeStudent(8)
}

fun gradeStudent(score: Int): Unit {
    when (score) {
        10 -> println("10分")
        9 -> println("9分")
        8 -> println("8分")
        7 -> println("7分")
        6 -> println("6分")
        else -> println("不及格")
    }
}
