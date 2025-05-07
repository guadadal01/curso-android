package com.guada.cfp401.cursoappsmoviles
fun main () {
    println (sacarRegistro (18, false))
    println (sacarRegistro (16, false))
    println (sacarRegistro (17, true))
}
fun sacarRegistro (edad: Int, permiso: Boolean): String{
   return if (edad >= 18) "Usted puede sacar el registro"
        else if ((edad < 18) && (permiso)) "Usted puede sacar el registro"
        else "Usted no puede sacar el registro"
}

