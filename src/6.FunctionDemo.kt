/**
 * 打印菱形
 */

fun main() {
    print1()
    print3()
    print5()
    print7()
    print5()
    print3()
    print1()


    println(adds(8, 6))


    var i = { a: Int, b: Int -> a + b }
    var i1 = i(3, 5)
    println(i1)

    var j: (Int, Int) -> Int = { x, y -> x + y }
    var j1 = j(2, 8)
    println(j1)

}


private fun print1(): Unit {
    println("   *   ")
}

private fun print3(): Unit {
    println("  ***  ")
}

private fun print5(): Unit {
    println(" ***** ")
}

private fun print7(): Unit {
    println("*******")
}

fun adds(a: Int, b: Int): Int = a + b





