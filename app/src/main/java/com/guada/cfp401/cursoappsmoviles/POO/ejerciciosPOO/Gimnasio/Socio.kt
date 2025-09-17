package com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO.Gimnasio

import java.time.LocalDate
import java.util.Date

class Socio (nombreCompleto: String, fechaNacimiento: Date, fechaIngreso: Date, private val servicios: MutableList<Servicio>):
    Persona(nombreCompleto, fechaIngreso) {
    fun montoAPagarEnFecha(fecha: LocalDate): Float{
        TODO("Haganoslo")
    }
   // override fun calcularCosto(): Float{}

}