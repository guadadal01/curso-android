package com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO

abstract class Instrumento {
   abstract fun tocar()
}

class Guitarra: Instrumento() {
   override fun tocar() {
      println("*Tocando cancion en la guitarra*")
   }
}

class Bateria: Instrumento() {
   override fun tocar() {
      println("*Tocando bateria*")
   }
}

fun main(){
   val guitarra1 = Guitarra()
   guitarra1.tocar()
   val bateria1 = Bateria()
   bateria1.tocar()
}