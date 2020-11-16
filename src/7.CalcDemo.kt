/**
 * 打印菱形
 */

fun main() {
    val a = add(1, 2)
    val b = reduce(1, 2)
    val c = ride(1, 2)
    val d = except(1, 2)
    println(a)
    println(b)
    println(c)
    println(d)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun reduce(a: Int, b: Int): Int {
    return a - b
}

fun ride(a: Int, b: Int): Int {
    return a * b
}

fun except(a: Int, b: Int): Int {
    return a / b
}

//练习
fun sayHello(name: String): String {
    return "Hello $name"
}

fun checkAge(age: Int): Boolean {
    return age > 18
}

fun saveLog(logLevel: Int) {

}

