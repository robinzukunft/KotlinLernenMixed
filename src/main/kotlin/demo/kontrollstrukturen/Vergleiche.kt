package demo

import java.lang.NumberFormatException

fun main() {
    var b1 = "255"
    var b2 = "255"
    var b3 = String(StringBuffer("255"))

    println(b1 == b2) // entspircht equals, inhaltlich gleich
    println(b1 === b2) // referenzielle Gleichheit
    println(b1.equals(b2))

    println()

    println(b1 == b3)
    println(b1 === b3)
    println(b1.equals(b3))

    val name: String = "racecar"
    println("Das ist die Ausgabe: ${name.toUpperCase()}")
    println("Das ist die Ausgabe: ${name.reversed().toLowerCase()}")

    if (name.reversed() == name)
        println("Palindrom")
    else
        println("Kein Palindrom")

    println()


    // Input
//    var userInput = readLine()
//    println("You entered ${userInput?.toUpperCase()}")
//
//    println()

//    val age = readLine()?.toInt()
//    if (age != null) {
//        if (age > 18)
//            println("erwachsen")
//        else
//            println("Nicht erwachsen")
//    }
//
//    println()
//
//    // Arrays
//    val zahlen = arrayOf(2, 3, 4, 1, 5, 6, 5)
//    val strs = arrayOf("Das", " ist", " ein", " Satz.")
//
//    for (str in strs) {
//        print(str)
//        println(zahlen)
//    }
//
//    println()

    // while
    val whileArray = arrayOf("Peter", "Bruce", "Natasha", "Carol")
    val arrayLength = whileArray.size

    println(arrayLength)

    println()

//    println("Enter number 1")
//    var num1 = readln().toInt()
//
//    println("Enter number 1")
//    var num2 = readln().toInt()
//
//    println("${num1} to the power of ${num2} = ${(num1) * num2}")
//
//    while (num2 > 0) {
//        var temp = 0
//        var temp2 = 0
//        temp = num1 * num1
//        temp2 = temp * num1
//
//        num2--
//    }

    println()

    for (i in 1..3) { // Ausgabe: 123
        print(i)
    }

    println()

    for (i in 10 downTo 5) { // Ausgabe: 1098765
        print(i)
    }

    println()

    for (i in 10 downTo 5 step 2) { // Ausgabe: 1086
        print(i)
    }

    println()

    for (i in 'a'..'z') { // Ausgabe: abcdefghijklmnopqrstuvwxyz
        print(i)
    }

    println()

    val maxArray = arrayOf(2, 5, 10, 7, 2)
    println(maxArray.max()) // Ausgabe: 10

    println()

    val list = listOf(1, 2, 3) // immutable list - unveränderbar
    val mList = mutableListOf(4, 5, 6) // mutable list - veränderbar - größe ebenfalls veränderbar
    mList.add(7) // Ans Ende der Liste hinzufügen
    mList.remove(7) // Löscht Listeneintrag
    mList.removeAt(0) // Löscht Listeneintrag an bestimmter index-Stelle

//    list[0] = 2 // keine neue Zuweisung möglich
    mList[0] = 2 // Neue Zuweisungen sind möglich

    println(mList)

//    println()
//
//    val newMList = mutableListOf<Int>()
//    for (i in 1..5) {
//        val x = readLine()?.toInt()
//        if (x != null) {
//            newMList.add(x)
//        }
//    }
//
//    println(newMList.reversed())


    println()

    // fibonaci
//    val fiboList = mutableListOf<Int>()
//
//    println("Enter the amount of fibonaci-numbers: ")
//    val amount = readLine()?.toInt()
//
//    var tempAlt = 1
//    var tempNeu = 2
//
//    fiboList.add(0)
//    fiboList.add(1)
//    fiboList.add(1)
//    fiboList.add(2)
//
//    for (i in 1..amount!! - 3) {
//        tempNeu = tempAlt + tempNeu
//        fiboList.add(tempNeu)
//        tempAlt = tempNeu - tempAlt
//
//
//    }
//
//    println(fiboList)

    println()
    // When
//    val userAge = readLine()?.toInt()
//    when(userAge) {
//        in 0..17 -> println("Happy Birthday") // in x..y gibt Range an
//        in 18..79 -> println("Adult")
//        18 -> println("Adult")                      // Einzelfall
//        18, 19, 20, 21 -> println("Best Years")     // Man kann Fälle mit , verbinden
//        in 79..100 -> println("Grown Man")
//        else -> println("super old")
//    }
//
//    println()
//
//    println("Where are you from?")
//    val langInput = readLine()?.toLowerCase()
//
//    when(langInput) {
//        "india" -> println("Namaste")
//        "usa" -> println("Hello")
//        "german" -> println("Hallo")
//        else -> "Sprache nicht bekannt"
//    }


    println()



    // Max-Value
    fun getMax(vararg numbers: Int): Int { // Vararg
        var max = numbers[0]
        for (number in numbers) {
           if (number > max) {
               max = number
           }
        }
        return max
    }

    val array = intArrayOf(10, 23, 90, 444)
    val max = getMax(10, 23, *array, 90, 444) // IntArray kann in anderes Array geschoben werden

    println(max)

    println()

    // Default-Value in Signature
    fun searchFor(seach: String, searchEngine: String = "Google") {
        println("Seach for '${seach}' on ${searchEngine} ")
    }
    searchFor("How to become a good programmer")
    searchFor(seach = "How to become the best Kotlin programmer")                           // searchEngine muss nicht angegeben werden, da defaul-wert in Signatur
    searchFor(seach = "How to become the best Kotlin programmer", searchEngine = "Bing")    // searchEngine kann aber noch angepasst werden
    searchFor(searchEngine = "Bing", seach = "How to become the best Kotlin programmer")    // Signatur kann von der Reihwnfolge vertauscht werden

    println()

    // Extension Functions
//    println("Zahl eingeben")
//    val eingabe = readLine()?.toInt()
//
//    if (eingabe != null) {
//        if (eingabe.isPrime()) {
//            println("Eingabe ist eine Primzahl")
//        }
//        else {
//            println("Eingabe ist keine Primzahl")
//        }
//        eingabe.isPrime()
//    }

    println()

    // Exceptions
//    println("Enter a number")
//    val exceptionInt = try {
//        readLine()?.toInt()
//    } catch (e: NumberFormatException) {
//        0
//    } finally {
//        println("This is from the final block")
//    }
//
//    println("You entered: $exceptionInt")

    println()

    // Lambda
    var listLambda = (1..20).toList()
    println(listLambda)
    listLambda = listLambda.filter { it % 2 == 0 } // it -> item
    println(listLambda)
}

fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1){
        if (this % i == 0) {
            return false
        }
    }

    return true
}

