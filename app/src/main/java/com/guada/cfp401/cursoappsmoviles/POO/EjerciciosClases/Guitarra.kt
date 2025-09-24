package com.guada.cfp401.cursoappsmoviles.POO.EjerciciosClases

import com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO.Instrumento

class Guitarra: Instrumentos() {
    override fun tocar() {
        println("Tocando guitarra")
    }
}