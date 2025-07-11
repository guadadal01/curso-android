package com.guada.cfp401.cursoappsmoviles.POO

class Estudiante(val nombre: String, var curso: String) {
    var promedio = 0.0f
    val notas = mutableListOf<Int>()

    fun rendirExamen(nota: Int) {
        notas.add(nota)
    }

    fun promedio(): Float {
        /*var promedio = 0
        var suma = 0
        var cantidad = 0
        for(nota in notas){
            suma += nota
            cantidad++
        }
        promedio = suma / cantidad
        return promedio.toFloat() */
        //return (notas.sum() / notas.size). toFloat()
        return if (notas. isNotEmpty()) notas.average().toFloat()
        else 0.0f
    }
}

fun main() {
    val estudiante1 = Estudiante("Guadalupe", "Programacion 1")
    estudiante1.rendirExamen(9)
    estudiante1.rendirExamen(8)
    estudiante1.rendirExamen(10)
    println(estudiante1.promedio())
}