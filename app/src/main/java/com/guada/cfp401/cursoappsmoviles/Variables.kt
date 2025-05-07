package com.guada.cfp401.cursoappsmoviles

fun main(){
    //println("holaa soy guada")
    //println ("como anda la banda")

    //Valores constantes

    val edad:Int = 19
    val altura: Float = 1.56f
    val nombre: String = "guadalupe"
    val miInicial : Char = 'G'

    println("hola soy $nombre, empieza con la letra $miInicial, tengo $edad años y mido $altura metros")

    // Valores mutables (Variables)

    var cantAlumnos: Int // Declaro
    cantAlumnos = 6 // Inicializo
    println ("Hasta hoy llegaron $cantAlumnos")
    cantAlumnos += 1 // se pueden con todas las operaciones (es lo mismo que cantAlumnos + 1)
    cantAlumnos *= 2

    println ("Ahora son $cantAlumnos")

    // Operadores Aritmeticos

    var num1: Int = 5
    var num2: Int = 2

    // Suma

    var resultado: Int = num1 + num2
    println ("suma: $resultado")

    //Resta

    println (num1 - num2)

    //Multiplicacion

    resultado = num1 * num2

    //Divison

    resultado = num1 / num2

    //Modulo (lo que queda de la division) divisiones enteras
    //num1 = 5
    //num2 = 2
    resultado = num1 % num2
    println("Modulo de $num1 / $num2: $resultado")

    //OPERADORES DE COMPARACION

    //Mayor que (>)
    println(num1 > num2)
    //mayor o igual (>=)
    println(num1 >= num2)
    //menor que (<)
    println(num1 < num2)
    //menor o igual (<=)
    println(num1 <= num2)
    //Igual (==)
    println(num1 == num2)
    //Distinto (!=)
    println(num1 != num2)

//OPERACIONES LOGICAS
    var resultadoLogico: Boolean

    //AND &&
    print("AND: ")
    println( (num1 > num2) && (num2 != num1) )
    // verdadero cuando todos sean verdaderos o falso con que una sea falso

    //OR ||
    print("OR: ")
    println( (num1 <= num2 ) || (num1 == num2) )
    // verdadero con que una sea verdadera o falsa cuando todas sean falsas

    // NOT !
    resultadoLogico = !(num1>num2)
    println("NOT: $resultadoLogico")
    // Niega el valor que tenia
}
