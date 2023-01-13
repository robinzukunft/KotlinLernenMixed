package demo.Vererbung

import java.time.Year

open class Parent(val name: String, val birthYear: Int){ // open ist wie public
    open val city: String = "Berlin"

    open fun info() {
        println("$name kommt aus $city und ist $birthYear geboren")
    }

    open fun neu() {
        println("was neues")
    }
}

open class Child(name: String, birthYear: Int): Parent(name, birthYear) {
    override val city = "Hamburg" // Methoden die vererbt werden, müssen mit override gekennzeichnet werden

//    final override fun info() { // final fungiert als private
    override fun info() { // final fungiert als private
        println("$name kommt aus $city und ist $birthYear geboren, hurra")
    }

    override fun neu() {
        super.neu()
        println("noch was vom Child")
    }
}

class SubChild(name: String, birthYear: Int): Child(name, birthYear), Info {
    override val city: String
        get() = super.city

    override fun info() {
        super<Info>.info()
        super<Child>.info()
        println("")
    }

    override fun demo() {
        TODO("Not yet implemented")
    }
}

interface Info {
    fun info() {
        println("Info aus dem Interface")
    }

    fun demo()
}

interface IstGueltig{
    fun accept(i: Int): Boolean
}

fun main(){
    val info = object : Info {
        override fun demo() {
            println("Meine Demo")
        }
    }

    info.demo()

//    val istGueltig = object: IstGueltig{
//        override fun accept(i: Int): Boolean {
//            return i % 2 == 0
//        }
//    }
//    val isGerade = IstGueltig
//
//    println("Die Zahl ist Gerade? ${istGueltig.accept(3)}")
}