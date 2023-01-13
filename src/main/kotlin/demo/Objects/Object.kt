package demo.Objects

import demo.Vererbung.Parent

object Obj {
    val name = "Peter"

    fun showName() {
        print("Hallo $name")
    }
}

object obj2: Parent("Peter", 1999) {
    fun showName() {
        print("Hallo $name")
    }
}

fun main() {
    val o = Obj
    o.showName()
    Obj.showName()
    obj2.info()

    var mc = MyClass.create()
    var mc2 = MyClass.create()
    println(mc === mc2) // Referenzenvergleich
}

class MyClass private constructor() {
     companion object {
//         lateinit var myClass: MyClass?=null // lateInit -> wird später initialisiert | Für kontrolliertes initialisieren
         var myClass: MyClass?=null // lateInit -> wird später initialisiert | Für kontrolliertes initialisieren

         fun create(): MyClass?{
             if (myClass == null){
                 myClass = MyClass()
             }
             return myClass
         }
     }
}