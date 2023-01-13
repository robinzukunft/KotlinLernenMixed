package demo

fun main(){
    val name: String ="Peter" // Alle val Variable sind Konstanten
    var vName ="Carol" // Die Datentypen müssen nicht angegeben werden
    vName = "Bruce"



    var temp : Number = 2.0
    temp = 1.toDouble() // Cast ist zwingend erforderlich
//    temp = 1 as Double // Geht nicht
    temp = 2 as Number // Geht

    var char: Char = 'c'
    char++;
    println(char)

    char = 47.toChar()
    println(char)

    val byte: Byte = 127 // Geht
//    val byte2: Byte = 128 // Geht nicht
    var uByte: UByte = 255u // Geht nicht
    uByte = 1u

    println(name)
    println(vName + " " + temp)
}