package com.guada.cfp401.cursoappsmoviles.POO

/*
Implementar una clase que cargue los lados de un triángulo e implemente los siguientes métodos: inicializar las propiedades, imprimir el valor del lado mayor y otro metodo que muestre si es equilátero o no.
 */
class Triangulo {
    var lado1 = 0.0
    var lado2 = 0.0
    var lado3 = 0.0

    fun inicializar() {
        println("Ingrese medida del primer lado:")
        lado1 = readln().toDouble()
        println("Ingrese medida del segundo lado:")
        lado2 = readln().toDouble()
        println("Ingrese medida del tercer lado:")
        lado3 = readln().toDouble()
    }

    fun trianguloEquilatero() {
        if ( lado1 == lado2 && lado2 == lado3 )
            println ("Es equilatero!")
        else println ("No es equilatero")
    }

    fun ladoMayor(){
       if (lado1 > lado2)
           println ("El lado 1 ($lado1) es mayor!!")
       else if (lado2 > lado3)
            println("El lado 2 ($lado2) es mayor!!")
       else if (lado1 == lado2 && lado2 == lado3)
           println ("No hay un lado mayor")
       else
           println("El lado 3 ($lado3) es mayor!!")
    }
}

fun main(){
    val trianguloNuevo = Triangulo()
    trianguloNuevo.inicializar()
    trianguloNuevo.trianguloEquilatero()
    trianguloNuevo.ladoMayor()
}