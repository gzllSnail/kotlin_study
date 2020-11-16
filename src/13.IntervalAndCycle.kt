fun main() {

    var nums1 = 1..100  //一个数组区间 1-100  [1,100]
    var nums2 = 1 until 100  //一个数组区间 1-99[1,100）

    var result = 0

    for (num in nums1) {
        result += num
    }
    println("结果： $result")

    // 每跳过两步输出一次
    for (num in nums2 step 2) {
        print(" ")
        print(num)
    }

    // 数字反转
    println()
    val reversed = nums2.reversed()
    for (num in reversed) {
        print(" ")
        print(num)
    }
    println()
    //集合有多少
    println("集合总数：${nums2.count()}")

}