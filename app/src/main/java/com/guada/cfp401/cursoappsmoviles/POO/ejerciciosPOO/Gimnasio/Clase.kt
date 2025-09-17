package com.guada.cfp401.cursoappsmoviles.POO.ejerciciosPOO.Gimnasio

import java.sql.Time
import java.time.LocalDate
import java.time.LocalTime
import java.util.Date

abstract class Clase (fecha: Date, protected val horaInicio: Time, protected val entrenador: Entrenador): Servicio(fecha){
    /*protected fun esDomingo (fecha: LocalDate): Boolean{

    }
    protected fun iniciaEnManiana(hora:LocalTime): Boolean{

    }

     */
}