package com.guada.cfp401.cursoappsmoviles.Sintaxis


fun main() {
    getMonth(3)
    getMonth (8)
}
fun getMonth (mes: Int){
    when(mes) {
    in 1..6-> println ("Primer semestre")
    in 7..12-> println("Segundo semestre")
        !in 1..12 -> println ("Ingrese un mes valido")
      }
}