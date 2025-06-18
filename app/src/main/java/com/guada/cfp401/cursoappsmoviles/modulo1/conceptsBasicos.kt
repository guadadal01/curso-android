package com.guada.cfp401.cursoappsmoviles.modulo1

fun ejercicio1(){
    println ("Use the val keyword when the value doesn't change")
    println ("Use the var keyword when the value can change")
    println ("When you define a function, you define the parameters that can be passed to it. ")
    println ("When you call a function, you pass arguments for the parameters")
}
fun ejercicio2() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
fun ejercicio3() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
fun ejercicio4() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun potencia(base: Int, exponente: Int): Int {
    var resultado = 1
    for (i in 1..exponente){
        resultado *= base
    }
    return resultado
}
fun ejercicio5() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    fun substract (num1: Int, num2: Int) : Int {
        return num1 - num2
    }
    val result = substract(firstNumber, secondNumber)
    val anotherResult = substract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}
fun ejercicio6() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"
    fun displayAlertMessage (operatingSystem: String, emailId: String): String{
        return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
    }
    println(displayAlertMessage(operatingSystem, emailId))
}

fun main (){
   ejercicio6()
}