package com.guada.cfp401.cursoappsmoviles.POO

class Empleado (nombre: String, edad: Int, altura: Float, var trabajo: String, var sueldo: Int): Persona(nombre,edad,altura) {
    override fun saludar() {
        super.saludar()  // Evita la recursion reescribiendo el metodo de la clase
        println("Trabajo como $trabajo")
    }
    fun pagarImpuesto(){
        if(sueldo > 3000){
            println("Debo pagar impuesto")
        } else println("No tengo que pagar impuesto")
    }
}

fun main(){
    val empleado1 = Empleado("Hugo",55,1.80f, "Obrero", 2500)
    empleado1.saludar()
    empleado1.pagarImpuesto()
}