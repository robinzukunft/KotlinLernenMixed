package demo.kontrollstrukturen

// Any ist stellvertretend für Object in Java. Alle Klasen erben von Any

fun main() {
    var i = 5
    var str = "5"
    val name = if (i < 5) "Kleiner" else "Größer" // If besitzt Rückgabewert, der weiter verwendet werden kann

    println(name)

    when(i) {
        0 -> println("Ausgabe ist: $i")
        5, 10, 23 -> println("Ausgabe ist: $i") // Fälle sind zusammenlegbar
        in 10..20 -> println("Ausgabe zwischen 10 - 20 ist: $i") // Fälle sind zusammenlegbar
        else -> println("Keine valide Nummer")
    }

    when{
        i == 5 -> println(5)
        str == "5" -> println("5: String")
    }

    var xy: Any? = when {
        i == 5 -> println(5)
        str == "5" -> println("5: String")
        else -> null
    }

    xy.toString()
}