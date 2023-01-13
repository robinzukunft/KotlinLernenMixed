package demo.Funktionen

import java.util.DoubleSummaryStatistics

fun withDefaults(anrede: String = "Hallo", name: String = "Peter") {
    println("$anrede $name")
}

fun add(i: Int, j: Int): Int {
    return i + j
}
// Vereinfachung:
fun add2(i: Int, j: Int): Int = i + j // SingleLineFunction

fun summe(vararg i: Int): Int {
    var sum = 0
    i.forEach { sum += it }
    return sum
}

fun varargs(str1: String, vararg liste: String, str2: String) {

}

//fun mwst (d: Double) = d * 1.19
//fun Double.mwst() = this * 1.19
//infix fun Double.flexMwst(value: Double) () = this * 1.19 ->  funzt bei mir nicht

fun main() {
    var zahl = 2.33

    withDefaults("Guten Tag")
    withDefaults("Guten Tag", "Hans")
    withDefaults(name = "Hans")
    println(add(2, 3))
    varargs("", "", "", str2 = "")
    println("NettoPreis: ${2.33} und Brutto ${2.33 * 1.19}")
    println("NettoPreis: ${zahl} und Brutto ${zahl.mwst()}")
    println("NettoPreis: ${zahl} und Brutto ${zahl.flexMwst(1.07)}")
    println("NettoPreis: ${zahl} und Brutto ${zahl flexMwst 1.07}")
}