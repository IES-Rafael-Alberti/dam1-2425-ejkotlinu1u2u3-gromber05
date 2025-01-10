package com.unidad3.listasYTuplas

import com.unidad2.capturaExcepciones.pedirNumero

fun Ejercicio06_U3() {
    val asignaturas = listOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val notasAsignaturas = ArrayList<Int>()

    try {
        for (i in 0 until asignaturas.size) {
            notasAsignaturas.add(pedirNumero("Inserte la nota de " + asignaturas[i]))
        }
    }
    catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}