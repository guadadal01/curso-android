package com.guada.cfp401.cursoappsmoviles.POO

class Gato (nombre: String, raza: String, edad: Int): Animal (nombre, raza, edad) {
    fun arañar() {
        if (energia > 15) {
            energia -= 15
            println("Grr..")
        } else println ("No tengo energia en este momento..")
        println("$energia energia restante")
    }
}

fun main (){
    val gato1 = Gato ("Tay", "Sin raza", 4)
    gato1.correr()
    gato1.dormir()
    gato1.arañar()
}