package com.guada.cfp401.cursoappsmoviles.Ejercicios

fun ejArray1 (){
    val miArreglo: Array<Int> = arrayOf(5,7,9,22,30)
    miArreglo.forEach{ println(it) }
}
fun ejArray2A(){
    val sumaTotal: Array<Int> = arrayOf(3,6,8,9,1,2,4,7)
    var sumaParcial = 0
    sumaTotal.forEach{sumaParcial += it}
    println (sumaParcial)
}
fun ejArray2B(){
    val misNumeros: Array<Int> = arrayOf(3,6,8,9,1,2,4,7)
    var sumaTotal: Int = misNumeros.sum()
    println("La suma total es $sumaTotal")
}
fun ejArray3A (){
    val numeros: Array<Int> = arrayOf(5,12,8,2,3,11,1,4,10,8,7,6,9)
    var minimo: Int = Int.MAX_VALUE
    var maximo: Int = Int.MIN_VALUE
    for(num in numeros) {
        if (num < minimo) minimo = num
        if (num > maximo) maximo = num
    }
        println("El menor numero es $minimo")
        println("El mayor numero es $maximo")
}
fun ejArray3B(){
    val numeros: Array<Int> = arrayOf(5,12,8,2,3,11,1,4,10,8,7,6,9)
    var minimo: Int = numeros.min()
    var maximo: Int = numeros.max()
    println ("El minimo numero es: $minimo")
    println ("El maximo numero es: $maximo")
}
fun main (){
    ejArray3B()
}