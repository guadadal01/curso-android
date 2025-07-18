package com.guada.cfp401.cursoappsmoviles.POO

open class Persona (val nombre: String, var edad: Int, var altura: Float) {
    open fun saludar(){
        println ("Hola mi nombre es $nombre, tengo $edad años y mido $altura")
    }
    fun cumplirAños(){
        edad++
        println("Feliz cumpleaños $nombre. Ya tenes $edad años!!")
    }
}
fun main(){
    val persona1 = Persona("Guadalupe",19,1.56f)
    persona1.saludar()
    persona1.cumplirAños()
}