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

    /**TODO:
     * 1. recibir el array por parametros
     * 2. Inicializar un contador en 0
     * 3. mientras recorro el arreglo, sacar el modulo sw cada elem por 2
     * 3.1. si el modulo es igual a 0, es par.
     * 3.2. incremento el contador de pares
     * 4. imprimo el contador
     */
    fun ejArray4(arreglo: Array<Int>){
        var contador: Int = 0
        val pares: ArrayList<Int> = arrayListOf()
        for (num in arreglo){
            if (num % 2 == 0){
                contador++
            pares.add(num)
            }
        }
        println ("Los pares son $pares y en total son: $contador")
}

fun ejArray5 (colores: ArrayList<String>){
    for ((indice, color) in colores. withIndex()) {
        if (color == "rojo") colores[indice] = color.uppercase()
    }
    println(colores)
}
fun ejArray6(gradosCelsius: Array <Double>){
    val gradosFahrenheit = gradosCelsius
}
    fun main (){
    val resultado = ejArray6(arrayOf(20.4,2.5,3.0,5.2, -5.0))
}