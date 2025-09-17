package com.guada.cfp401.cursoappsmoviles.POO

class Alumno (nombre: String, val notas: List<Double>) {
    fun promedio() = notas.average()

    fun aprobo(): Boolean {
        return promedio() >= 6
    }
}
fun main(){
    val alumno1 = Alumno ("Guada", listOf(5.5,8.0,7.2))
    alumno1.promedio()
    alumno1.aprobo()
}