package com.guada.cfp401.cursoappsmoviles.POO.EjerciciosClases

data class Libro(val titulo: String, val autor: String, val añoPublicacion: Int)


fun main(){
    val hungerGames = Libro("Los juegos del hambre", "Suzanne Collins", 2011)
    val nuevaEdicion = hungerGames.copy(añoPublicacion = 2012)
    println(hungerGames)
    println(nuevaEdicion)
}