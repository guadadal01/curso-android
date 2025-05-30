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
fun main (){
    ejArray2A()
}