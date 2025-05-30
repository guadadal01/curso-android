package com.guada.cfp401.cursoappsmoviles.Ejercicios

fun main (){
 clasificarEdad(67)
    nombreDelDia (5)
}
fun clasificarEdad (edad: Int) {
    when (edad){
        in 0..12 -> println ("Niño")
        in 13..17 -> println ("Adolescente")
        in 18..64 -> println ("Adulto")
        in 65.. 124 -> println ("Adulto Mayor")
        else -> println ("No puedo clasificar esa edad")
    }
}
fun nombreDelDia (numero: Int):String {
     return when (numero) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6->  "Sabado"
        7-> "Domingo"
        else -> "Dia no valido"
    }
}
fun calcular (a: Double, b: Double, operador: Char) {
    if (operador == '+') println (a+b)
    else if (operador == '-') println(a-b)
    else if (operador == '*') println(a*b)
    else if (operador == '/'){
        if (b != 0.0) println(a / b)
        else println (0.0)
    }
    else println ("SINTAX ERROR")
}
fun calcularWhen (a: Double, b: Double, operador: Char){
    when (operador){
        '+' -> println (a + b)
        '-' -> println (a-b)
        '*' -> println(a*b)
        '/' -> if (b != 0.0) println (a / b) else println (0.0)
        else -> "Operador no valido"
    }
}