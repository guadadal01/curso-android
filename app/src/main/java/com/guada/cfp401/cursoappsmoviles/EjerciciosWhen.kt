package com.guada.cfp401.cursoappsmoviles

fun main (){
 clasificarEdad(13)
    nombreDelDia (5)
}
fun clasificarEdad (edad: Int) {
    when (edad){
        in 1..12 -> println ("Niño")
        in 13..17 -> println ("Adolescente")
        in 18..64 -> println ("Adulto")
        in 65.. 205 -> println ("Adulto Mayor")
        else -> println ("No puedo clasificar esa edad")
    }
}
fun nombreDelDia (numero: Int) {
     when (numero) {
        1 -> println ("Lunes")
        2 -> println ("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println ("Viernes")
        6->  println ("Sabado")
        7-> println("Domingo")
        else -> println("Numero invalido")
    }
}