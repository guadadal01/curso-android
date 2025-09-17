package com.guada.cfp401.cursoappsmoviles.POO

open class EmpleadoPadre (val nombre: String, val sueldo: Double) {
   open fun mostrarDatos(){
        println ("Soy $nombre y mi sueldo es de $sueldo")
    }
}
