package com.guada.cfp401.cursoappsmoviles.POO

class CuentaBancaria (titular: String) {
    var saldo = 0.0

   fun depositar (unMonto: Float){
            this.saldo += unMonto
            println("Tu dinero ha sido depositado exitosamente. Tu saldo total es de: $saldo")

    }
    fun extraer (unMonto: Float){
        if (saldo >= unMonto){
            saldo -= unMonto
            println("Tu dinero ha sido extraido exitosamente. Tu saldo restante es de: $saldo")
        } else println ("No se puede realizar esta accion")
    }

   fun mostrarSaldo(){
        println("Tu saldo total es: $saldo")
    }
}
fun main(){
    val cuenta1 = CuentaBancaria("Guada")
    cuenta1.depositar(2000.0f)
    cuenta1.extraer(2300.0f)
    cuenta1.extraer(300.0f)
    cuenta1.depositar(2800.0f)
    cuenta1.mostrarSaldo()
}