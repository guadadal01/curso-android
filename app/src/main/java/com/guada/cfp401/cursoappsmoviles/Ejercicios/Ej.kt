package com.guada.cfp401.cursoappsmoviles.Ejercicios

private fun ejHeladero() {
    fun leerCantBochas(): Int {
        println("Ingrese la cantidad de bochas deseadas:")
        return readln().toInt()
    }

    fun leerPrecio(): Float {
        println("Ingrese el precio por bocha:")
        return readln().toFloat()
    }

    fun aplicarDescuento(cantidad: Int, precio: Float): Float {
        var total = cantidad * precio
        if (cantidad > 3) total = total * 0.9f
        return total
    }

    fun mostrarImporte(importe: Float) {
        println("El importe total es: $importe")
    }
    val cantBochas = leerCantBochas()
    val precioPorBocha = leerPrecio()
    val importeTotal = aplicarDescuento(cantBochas, precioPorBocha)
    mostrarImporte(importeTotal)
}

private fun ejColectivo() {
    fun obtenerDistancia(): Float {
        println("Ingrese la cantidad de kilometros a recorrer:")
        return readln().toFloat()
    }
}
 /*   fun calcularCosto(km: Float): Float {
        var precio: 120f
        if(km > 50) {
            precio = 100f
        } else
        return km * precio
    }
    fun imprimirTicket(km: Float, precio: Float){
        println("El importe total a pagar para recorrer $km km es de $precio")
    }

}

fun main(){
    ejHeladero()
} */