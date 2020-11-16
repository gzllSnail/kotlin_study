fun main() {

    var lists = listOf("买鸡蛋", "卖大米", "卖花生", "买玉米", "卖红薯", "卖冰糕")

    for (list in lists) {
        println(list)
    }

    for ((i, e) in lists.withIndex()) {
        println("$i , $e")
    }


}