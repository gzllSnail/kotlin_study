package objectOriented.agent
//TODO 接口代理和委托 by ：by BigHeadSon()


//洗碗的接口
interface IWashBow {

    fun washing()

}

//大头儿子 : TODO 如果不使用class  而是用 object 就是单例模式  内存中有且只有一个   by BigHeadSon  就可以了 不用()
object BigHeadSon : IWashBow {
    override fun washing() {
        println("大头儿子：洗碗 一次一块")
    }

}

//小头爸爸
//class SmallHeadFather : IWashBow {
//    override fun washing() {
//        println("小头爸爸：洗碗 一次十块")
//    }
//}


//小头爸爸：每次都要洗碗 ，然后让儿子洗碗，给他2块钱 ，净赚8块
class SmallHeadFather : IWashBow by BigHeadSon {
    override fun washing() {
        println("小头爸爸：安排儿子洗碗")
        BigHeadSon.washing()
        println("小头爸爸：再多给他一块钱")
        println("小头爸爸：看着洗完了")

    }
}


fun main() {
//    val son = BigHeadSon()
//    son.washing()

    val father = SmallHeadFather()
    father.washing()


}