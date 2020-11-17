package objectOriented.enumeration

//TODO 枚举

enum class Week {
    One, Two, Three, Four, Five, Six
}

fun main() {
    println(Week.Three)
    println(Week.Three.ordinal)
}