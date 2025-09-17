package com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO

abstract class Personal(val nombre: String) {
    fun presentarse(){
        "Hola soy $nombre"
    }
}
class Alumno(nombre: String): Personal(nombre){
   val notas: MutableList<Int> = mutableListOf()
    fun rendirExamen(nota: Int){

    }
    fun promedio(): Double {
        return if (notas. isNotEmpty()) notas.average().toDouble()
        else 0.0
    }
}

class Docente(nombre: String, val curso: List<String>): Personal(nombre), administrativo{
    fun darClase(){
        println("Hoy vamos a dar..")
    }
    override fun firmar(): String = this.nombre
}
class Preceptor(nombre: String): Personal(nombre), administrativo{
    fun pasarAsistencia(){
        println("Hoy vinieron...")
    }
    override fun firmar(): String = this.nombre
}
class Curso(val nombre: String, val docente: Docente, val alumnos: MutableList<Alumno>,val preceptora:Preceptor) {
    fun mejorPromedio(): Double {
        var mejorActual: Double = 0.0
        for (alumno in alumnos) {
            var promedioActual: Double = alumno.promedio()
            if (promedioActual > mejorActual) mejorActual = promedioActual
        }
        return mejorActual
    }
}
interface administrativo {
    fun firmar(): String
}
