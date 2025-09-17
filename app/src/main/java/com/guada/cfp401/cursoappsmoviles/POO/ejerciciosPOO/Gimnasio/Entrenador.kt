package com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO.Gimnasio

import java.time.LocalDate
import java.time.temporal.ChronoUnit
import java.util.Date

class Entrenador (nombreCompleto: String, fechaIngreso: Date,private val honorarioManiana: Float, private val honorarioTarde: Float):
    Persona(nombreCompleto,fechaIngreso) {
    /*fun antiguedad(): Int{

    }

     */
    private fun difAnios(inicio: LocalDate, fin: LocalDate): Long{
        return ChronoUnit.YEARS.between(inicio, fin)
    }
    fun honorario(esDeManiana: Boolean): Float{
        return if(esDeManiana){
            honorarioManiana
        }else honorarioTarde
    }
}