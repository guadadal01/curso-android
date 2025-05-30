package com.guada.cfp401.cursoappsmoviles.Sintaxis

fun esMayordeEdad(edad: Int): String {
    return if (edad >= 18) "Es mayor de edad"
    else if (edad == 15) "Feliz cumpleaños"
    else "Es menor de edad"
}
 /* FORMAS PARA USAR 1 RETURN
 Opcion 1:

 var texto: String
    if (edad >= 18) texto ("Es mayor de edad")
    else texto ("Es menor de edad")
    return texto

 Opcion 2:

 var texto: String
 texto = if (edad >= 18) return "Es mayor de edad" else "Es menor de edad"
  return texto

 Opcion 3 (mejor):

  return if (edad >= 18) "Es mayor de edad"
    else "Es menor de edad"
  */
fun main () {
    println (esMayordeEdad(readln().toInt()))
     println("Ingrese su nombre: ")
}

