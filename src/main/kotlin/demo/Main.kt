package demo

import demo.PersonJava
import demo.PersonKotlin

fun main() {
    println("Hello World!")
    println("demo.Test")

    var pj = PersonJava(22)
    println(pj.toString())

    var pk = PersonKotlin(33, vorname = "Bruce")
    println(pk.toString())

    println()
    println(pk.id)
    println()

    val pj2 = PersonJava(44)
    println(pj2.toString())

    val pk2 = PersonKotlin(11, vorname = "Carol")
    println(pk2.toString())
}

