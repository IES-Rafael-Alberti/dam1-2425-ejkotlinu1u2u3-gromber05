package com.unidad3.listasYTuplas

import kotlin.math.sqrt

fun Ejercicio13_U3() {

    try {
        val serie = pedirListaNumeros()

        if (serie.isNotEmpty()) {
            val calculo = desviacionTipica(serie)
            println("El resultado es »» $calculo")
        } else {
            println("No se ingresaron números válidos.")
        }
    }
    catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun pedirListaNumeros(): List<Int> {
    return try {
        print("Introduzca una serie de números separados por comas »» \n")
        val input = readLine() ?: ""
        input.split(",").mapNotNull { it.trim().toIntOrNull() }
    }
    catch (e: Exception) {
        println("**ERROR** »» ${e.message}")
        emptyList()
    }
}

fun desviacionTipica(lista: List<Int>): Double {
    val totalNumeros = lista.size
    val media = lista.average()

    val cuadrados = lista.sumOf { (it - media) * (it - media) }
    val resultado = sqrt(cuadrados / totalNumeros)

    return "%.2f".format(resultado).toDouble()
}