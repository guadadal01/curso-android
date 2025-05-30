package com.guada.cfp401.cursoappsmoviles.Ejercicios

import kotlin.random.Random

fun ejercicio1 (){
    for (i in 1..10){
        println (i)
    }
}
fun ejercicio2 (){
    var i: Int = 5
    while(i <= 15){
        print ("$i ")
        i ++
    }
}
fun ejercicio3 (){
    var i: Int = 1
    do{
        println ("Hola")
        i++
    }while(i <= 3)
}
fun ejercicio4 (){
    val arr : Array<String> = arrayOf("Pepe", "Pedro", "Pablo", "Maria", "Juan", "Julia", "Lucas")
    for(i in arr.indices) {
        println( "arr[$i] -> ${arr[i]}")
    }
}
fun ejercicio5(){
    val numeros: Array<Int> = arrayOf(1,2,3,4,5,6)
    val totalParcial : MutableList<Int> = mutableListOf(0)

    var parcial: Int = 0
    for (num in numeros){
        parcial += num
        totalParcial.add(parcial)
    }
    println (totalParcial)
}
fun ejercicio6 (){
    for (i in 1..5){
        print ("Tabla de $i: ")
        for (j in 1..10){
            print ("$i x $j = ${i*j} |")
        }
        println ()
    }
}
fun ejercicio7(){
    var opcion : Int
    do{
        println("Ingrese una opcion:")
        println ("1- Saludar")
        println("2- Despedir")
        println ("0 - Salir")
        opcion = readln().toInt()
        when(opcion){
            1 -> println ("Holaa")
            2 -> println("Chauuu")
            0 -> println("Gracias por usar el sistema")
        }
    }while (opcion != 0)
}
fun ejercicio8(miString: String){
    for (i in miString.length-1 downTo 0)
        print(miString[i])
}
fun ejercicio9() {
    val adivinalo: Int = Random.nextInt(1, 50)
    println("Adivine el numero entre 1 y 50")
    var input: Int = readln().toInt()
    while (input != adivinalo) {
        if (input > adivinalo) println ("Mas abajo")
        else println ("Mas arriba")
        input = readln().toInt()
    }
    println ("Felicitaciones adivinaste!!")
}
fun ejercicio10 (){
    var numero: Int = 10
    while(numero >= 0){
        println (numero)
        numero--
    }
    println ("Despegue")
}

fun main (){
 ejercicio10()
}