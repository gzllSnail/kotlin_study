fun main() {
    var string1 = "张三"
    var string2 = "张三"
    println(string1 == string2)

    var string3 = "张三"
    var string4 = "李四"
    println(string3 == string4)


    var string5 = "Android"
    var string6 = "android"
    println(string5 == string6)
    println(string5.equals(string6, true))//是否忽略大小写

}