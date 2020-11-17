package objectOriented.seal

//印章类

//比枚举更在意类型
//枚举更在意数据
sealed class Son {
    class mule : Son()

    class donkey : Son()


    fun sayHello() {
        println("hello")
    }
}


fun main() {
    val s1: Son = Son.donkey()
    val s2: Son = Son.mule()
    val s3: Son = Son.mule()

    val list = listOf<Son>(s1, s2, s3)
    for (l in list) {
        if (l is Son.mule) {
            println("骡子")
        }
    }
}