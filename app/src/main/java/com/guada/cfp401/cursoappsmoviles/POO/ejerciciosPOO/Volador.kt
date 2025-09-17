package com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO

interface Volador { //No se puedse usar atributos(si son necesarios serian clases abstractas)
    fun volar()
}
class Pajaro: Volador{
    override fun volar(){
        println("El pajaro empezo a volar")
    }
}
class Avion: Volador {
    override fun volar() {
        println("El avion ya esta volando!")
    }
}

fun main(){
    val avion1 = Avion()
    avion1.volar()
    val pajaro1 = Pajaro()
    pajaro1.volar()
}