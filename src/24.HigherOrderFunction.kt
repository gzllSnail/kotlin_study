data class Girl(var name: String, var age: Int, var height: Int, var address: String)

var names = listOf<Girl>(
    Girl("咪咪", 19, 175, "河南"),
    Girl("喵喵", 29, 196, "河北"),
    Girl("花花", 23, 159, "广东"),
    Girl("欣欣", 21, 167, "辽宁"),
    Girl("亮亮", 27, 165, "吉林"),
    Girl("乐乐", 29, 162, "内蒙古"),
    Girl("玲玲", 26, 161, "广西"),
    Girl("学儿", 25, 160, "深圳"),
    Girl("佳佳", 39, 162, "湖北"),
    Girl("吉吉", 34, 163, "河北"),
    Girl("萍萍", 19, 179, "河南"),
    Girl("红红", 22, 163, "辽宁"),
    Girl("莹莹", 20, 158, "深圳")
)

fun main() {
    //找年龄最大的 (传统的平常写法)
    var maxAge = 0
    for (g in names) {
        if (g.age > maxAge) {
            maxAge = g.age
        }
    }
    println("最大的年龄：$maxAge")
    for (g in names) {
        if (g.age == maxAge) {
            println(g)
        }
    }

    //找年龄最大的 (kotlin写法)
    println(names.maxBy { it.age })
    //找身高最低的 (kotlin写法)
    println(names.minBy { it.height })
    //年龄大于24的
    println(names.filter {
        (it.age > 24) and (it.age < 27)
        it.height > 165
    })

    //提取部分数据到新的集合
    println(names.map {
        "${it.name}:${it.age}"
    })
    //判断是否有符合条件的数据
    println(names.any {
        it.age == 19
    })

    //统计满足条件的个数
    println(names.count {
        it.age < 23
    })

    //查找第一个符合条件的，并返回
    println(names.find {
        it.age == 19
    })


    //按照条件进行分组
    println(names.groupBy {
        it.address
    }["河北"]?.forEach { println(it) })


}


