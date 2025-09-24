package com.guada.cfp401.cursoappsmoviles.POO.EjerciciosClases

import com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO.Instrumento

class Bateria(): Instrumentos() {
    override fun tocar() {
        println("Tocando bateria")
    }
}