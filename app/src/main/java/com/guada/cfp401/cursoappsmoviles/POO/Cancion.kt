package com.guada.cfp401.cursoappsmoviles.POO

class Cancion(val titulo: String, val duracion: Float, val artista: String, val genero: String) {
    var letra = ""

    fun promt(): String = "$artista - $titulo (duracion: $duracion min)"
    fun reproducir() {
        println("Reproduciendo ${promt()} ")
    }

    fun pausar() {
        println("Pausando ${promt()}")
    }

    fun reanudar() {
        println("Reanudando ${promt()}")
    }
}
fun main(){
    val cancion1 = Cancion ("POO",3.5f, "Kotlinianos", "Pop")
    cancion1.reproducir()
    cancion1.pausar()
    cancion1.reanudar()
}