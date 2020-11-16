fun main() {


    println(rectArea(3.0f, 2.0f))
    println(circularArea(3.14f, 2.0f))
    println(circularPerimeter(3.0f, 2.0f))
    println(cylinderVolume(3.14f, 2.0f, 5.0f))
    println(ballArea(3.14f, 2.0f))

}

fun rectArea(w: Float, h: Float): Float {
    return w * h
}

fun circularArea(pi: Float, r: Float): Float {
    return 2 * pi * r
}

fun circularPerimeter(pi: Float, r: Float): Float {
    return 2 * pi * r
}

fun cylinderVolume(pi: Float, r: Float, h: Float): Float {
    var  pi = 3.14f
    return pi * r * r * h
}

fun ballArea(pi: Float, r: Float): Float {
    return 4 * pi * r * r
}




