package objectOriented.`package`

import sun.misc.VM

class WashMachine(var n: String, var size: String) {
    var isOpenDoor = true

    fun openDoor() {
        println("开门")
        isOpenDoor = false
    }

    fun closeDoor() {
        println("关门")
        isOpenDoor = true
    }

    fun start() {
        if (isOpenDoor) {
            print("放水")
            print("满了")
            print("开始")
        } else {
            println("门还没关")
        }
    }

    fun setSpeed(a: Int) {
        print("转速：$a")
    }

}


fun main() {
    var wm = WashMachine("小天鹅", "19")
    println(wm.size)
    println(wm.n)
    wm.openDoor()
    wm.closeDoor()
    wm.start()


}

