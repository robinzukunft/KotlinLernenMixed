package demo

import java.util.DoubleSummaryStatistics

class Rectangle(
    val a: Double,
    val b: Double
) {
    init {
        println("Rectangle created with a = ${a} and b ${b}")
    }

    fun area(): Double {
        return a * b
    }




}

fun main() {
    val rectangle = Rectangle(4.0, 7.0)

    val x: Int = 0
    val y: Int = 2

    println(x.plus(y))
    println(rectangle.area())
}