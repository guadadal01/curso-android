package com.guada.cfp401.cursoappsmoviles.Ejercicios

import com.guada.cfp401.cursoappsmoviles.Sintaxis.esMayordeEdad

fun leerNombre(): String {
    println("Ingrese su nombre: ")
    return readln()
}
fun leerEdad(): Int {
    println("Ingrese su edad: ")
    return readln().toInt()
}
fun leerAltura(): Float{
    println("Ingrese su altura: ")
    return readln().toFloat()
}
fun mayoriaDeEdad(edad: Int) {
    if (edad >= 18) {
        println("Sos mayor de edad!")
    } else println("Sos menor de edad")
}
fun saludar(edad: Int){
    println("Hola ${leerNombre()}, tenes $edad y medis ${leerAltura()} metros.")
}
 /*
fun main(){
    val edad = leerEdad()
    saludar(edad)
    mayoriaDeEdad(edad)
}
  */
 fun notaDeAlumno(nota: Int){
     when(nota){
         10 -> println ("Excelente")
         in 7..9 -> println("Aprobado")
         in 0..6 -> println("Desaprobado")
     }
 }
fun contadorAscendente(){
    for (i in 1 ..10){
        println (i)
    }
}
fun contadorDescendente() {
    var numero = 5
    while (numero > 0) {
        println(numero)
        numero--
    }
}

fun promedioDeNotas(){
    println("Ingrese su primer nota:")
    val nota1 = readln().toInt()
    println("Ingrese su segunda nota:")
    val nota2 = readln().toInt()
    println("Ingrese su tercer nota:")
    val nota3 = readln().toInt()
    var promedio =(nota1 + nota2 + nota3) /3.0f
    println("Su promedio es: $promedio")
}

fun main(){
    promedioDeNotas()
}
