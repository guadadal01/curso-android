package com.guada.cfp401.cursoappsmoviles.POO

class Alumno {
    var nombre = ""
    var nota = 0

    fun inicializar(){
        print("Nombre del alumno:")
        nombre = readln().toString()
        print("Nota del alumno:")
        nota = readln().toInt()
    }
    fun estadoAlumno(){
        if (nota >= 4)
            print("Alumno regular")
        else
            print ("Desaprobado")
    }
}

fun main (){
    val alumno1 = Alumno()
    alumno1.inicializar()
    alumno1.estadoAlumno()
}