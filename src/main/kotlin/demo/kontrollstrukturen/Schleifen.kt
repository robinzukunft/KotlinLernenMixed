package demo

fun main() {
    for (i in 1..10) {
        println(i)
    }
    for (i in 1 until 10) {
        println(i)
    }
    for (i in 10 downTo  1 step 2) {
        println(i)
    }


    var array: Array<String> = arrayOf("eins", "zwei", "drei")
    for (str in array) {
        println(str)
    }
    array.forEach { println(it) }
    array.forEachIndexed {  index, s -> println("an Position $index : $s")} // Gibt den Index mit
}