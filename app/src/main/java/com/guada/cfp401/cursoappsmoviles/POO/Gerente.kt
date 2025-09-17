package com.guada.cfp401.cursoappsmoviles.POO

class Gerente(val departamento: String): EmpleadoPadre("Guada", 200.0) {
    override fun mostrarDatos(){
        super.mostrarDatos()
        println("Trabajo en $departamento")
    }
}
fun main(){
    val gerente1 = Gerente("departamento de ventas")
    gerente1.mostrarDatos()
}