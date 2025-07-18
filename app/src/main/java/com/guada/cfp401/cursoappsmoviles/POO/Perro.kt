package com.guada.cfp401.cursoappsmoviles.POO

class Perro (nombre: String, raza: String, edad: Int, val esPolicia: Boolean): Animal(nombre,raza,edad) {
    fun ladrar() {
        if (energia > 5) {
            energia -= 5
            println("Woaf")
        } else println("No puedo en este momento..")
        println("$energia energia restante")
    }
}

fun main (){
    var perro1 = Perro("Athila", "Calle", 6,true)
    perro1.energia
    perro1.comer()
    perro1.ladrar()
    perro1.tomarAgua()
    perro1.dormir()
    perro1.correr()
}