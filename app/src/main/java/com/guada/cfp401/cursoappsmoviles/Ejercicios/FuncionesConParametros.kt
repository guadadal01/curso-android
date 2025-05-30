package com.guada.cfp401.cursoappsmoviles.Ejercicios

fun areaRectangulo(base: Double =1.0, altura: Double =1.0) : String {
    return "El area del rectangulo es: ${base * altura}"
}
fun convertirCelsius(celsius: Double =1.0): Double {
    return (celsius + 9 / 5) + 32
}

fun main (){
    println ("La suma de dos numeros es: " +(5+2)) //Concatenacion
    println ("El area es: " + areaRectangulo (2.5,3.0))
    println ("El area es: ${2.5*3.4}")

    var texto: String = readln()
    println ("El usuario ingreso $texto")
    var num: Int = readln().toInt()
    println("La edad del usuario es $num")
}