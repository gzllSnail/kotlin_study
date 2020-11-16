package objectOriented.inherit

//类允许继承需要 open
//方法重载需要 open
open class Father() {

    var money: String = "有钱"
    var heat: String = "心情好"

    open fun setXX() {
        println("大方")
    }

}

class Son : Father() {

    override fun setXX() {
        println("小气")
    }


}


fun main() {
    var son = Son()

    son.setXX()
    println(son.money)
    println(son.heat)

}
