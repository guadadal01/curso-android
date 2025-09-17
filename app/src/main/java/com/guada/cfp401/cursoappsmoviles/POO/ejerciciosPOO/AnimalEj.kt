package com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO

abstract class AnimalEj { //clase abierta que no se puede instanciar que sirven para heredar
    abstract fun hacerSonido() // esta funcion se debe implementar si o si en la clases hijas
    fun respirar(){
        println("Respirando..")
    }
}
class Pez (val raza: String, val edad: Int): AnimalEj(){
    override fun hacerSonido(){
        println("Glu glu")
    }
}

fun main(){
    val pez1 = Pez("Globo",12)
    pez1.respirar()
    pez1.hacerSonido()
}

