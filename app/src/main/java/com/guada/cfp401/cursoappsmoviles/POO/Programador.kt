package com.guada.cfp401.cursoappsmoviles.POO

class Programador {
    var nombre = "" // Inicializada
    var lenguaje = ""

    fun inicializar(nombre: String, lenguaje: String){
        this.nombre = nombre
        this.lenguaje = lenguaje
    }
    fun presentarse(): String = "Hola soy $nombre y programo en $lenguaje" //Sin necesidad de return
}

fun main(){
    var guada = Programador() // metodo constructor
    guada.inicializar("Guadalupe", "Kotlin")
    println (guada.presentarse())
}