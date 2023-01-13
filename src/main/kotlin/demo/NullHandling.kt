package demo

fun main() {
    var name: String? = value("null")

    if (name != null) {
        println(name.length)
    }

//    println(name!!.length) // Behauptung name ist niemals null - nur im Ausnahmefall
    println(name?.length) // name kann null sein, führe den dahinterliegende Teil nicht aus

    println(name?.length ?: -1) // Elvisoperator

    name?.length?.let { println(name.length) }
    name?.length?.let { println(name.length) } ?: {
        println(-1)
        println("xy")
    }

    output("Peter", "Parker")
}

fun value(str: String): String? {
    return str
}

fun output(name: String, firstName: String) {
    println("Hallo " + firstName + " " + name + ", whazzuuuup?")
    println("Hallo $firstName $name, whazzuuuup?") // $ -> Variablenname
    println("Es sind insgesamt ${name.length + firstName.length} Zeichen vorhanden") // Man kann im Stringtemplate rechnen oder weiteres damit ausführen
}