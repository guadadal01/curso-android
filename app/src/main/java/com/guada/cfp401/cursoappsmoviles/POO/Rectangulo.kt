package com.guada.cfp401.cursoappsmoviles.POO

class Rectangulo (val base: Int, val altura: Int) {
    fun area (): Int {
        return base * altura
    }
    fun perimetro(): Int {
        return 2 * (base + altura)
    }

    fun imprimir(){
        println("El area de este rectangulo es de: ${area()}")
        println("El perimetro de este rectangulo es de: ${perimetro()}")
    }
}

fun main(){
    val rectangulo1 = Rectangulo(7,5)
    rectangulo1.area()
    rectangulo1.perimetro()
    rectangulo1.imprimir()
}