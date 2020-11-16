package objectOriented.polymorphic

//接口
interface IMan {
    fun xiaoDiDi()
}

interface IWoMan {
    fun xiaoMeiMei()
}


//抽象类
abstract class Human(var name: String) {

    abstract fun eat()

    abstract fun pee()

}