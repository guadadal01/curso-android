package com.guada.cfp401.cursoappsmoviles.POO.EjerciciosClases


class Auto (val marca: String, val modelo: String, val año:Int) {
    fun mostrarInfo(){
        println("Auto Marca: $marca, Modelo: $modelo, Año: $año")
    }
}
fun main(){
    val auto1 = Auto("Ford","Fiesta",2008)
    auto1.mostrarInfo()
}