package demo.kontrollstrukturen

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val zoo = Zoo(listOf(
        Animal("Zebra"),
        Animal("Tiger"),
        Animal("Panda"),
        Animal("Känugu")))

    for (animal in zoo) { // iterator()-Funktion muss nicht aufgerufen werden, da das Schlüsselwort operator, die Methode intern aufruft
        println(animal.name)
    }
}