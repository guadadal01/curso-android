package com.guada.cfp401.cursoappsmoviles.POO

open class Animal (val nombre: String, val raza: String, var edad: Int) {
    var energia = 100
    init{ // metodo que se ejecuta cuando se instancia el objeto
        if (edad < 0){
            edad = 0
        }
    }
    fun comer(){
        if (energia < 100) {
            energia += 10
            println("Yumm")
        } else println("Estoy lleno...")
        println ("$energia energia restante")
    }
fun tomarAgua() {
    if (energia < 100) {
        energia += 5
        println ("Tenia mucha sed!")
    } else println("No tengo sed...")
    println("$energia energia restante")
}
fun dormir(){
    if (energia < 100){
        energia += 15
        println ("Estaba muy cansado")
    } else println("Prefiero jugar!!")
    println("$energia energia restante")
}
fun correr() {
    if (energia > 20) {
        energia -= 20
        println("Que divertido!")
    } else println("No puedo en este momento..")
    println("$energia energia restante")
  }
}
