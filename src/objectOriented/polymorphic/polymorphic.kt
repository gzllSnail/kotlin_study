package objectOriented.polymorphic


class Man(name: String) : Human(name), IMan {
    override fun eat() {
        println("$name 哇哇哇哇的大口吃")
    }

    override fun pee() {
        println("$name 站着尿尿")
    }

    override fun xiaoDiDi() {
        println("18cm")
    }

}

class WoMan(name: String) : Human(name), IWoMan {
    override fun eat() {
        println("$name 吸溜吸溜的小口吃")
    }

    override fun pee() {
        println("$name 蹲着尿尿")
    }

    override fun xiaoMeiMei() {
        println("深18cm")
    }

}

fun main() {

    var person1 = Man("金三胖")
    person1.eat()
    person1.pee()
    person1.xiaoDiDi()
    var person2 = WoMan("宋茜")
    person2.eat()
    person2.pee()
    person2.xiaoMeiMei()


}