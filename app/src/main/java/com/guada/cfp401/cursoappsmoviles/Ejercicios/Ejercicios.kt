package com.guada.cfp401.cursoappsmoviles.Ejercicios

fun main (){
    val resultado = compararPersonas("Guadalupe", "Martina")
    println (resultado)
}
fun compararPersonas(persona1: String, persona2: String): String{
    return if (persona1 == persona2) "Nombre de usuario ya existente"
        else "¡Bienvenidos!"
}
