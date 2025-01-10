package com.unidad3.listasYTuplas

import com.unidad2.capturaExcepciones.pedirNumero

fun Ejercicio04_U3 () {
    val lista = ArrayList<Int>()

    try {
        for (i in 1..5) {
            val input = pedirNumero("Introduzca los números de la lotería primitiva »» ")
            lista.add(input)
        }
        val newLista = lista.sorted()
        println("Los números de la lotería ordenada son: $newLista")
    }
    catch (e: NumberFormatException) {
        println("No puedes introducir otra cosa que no sea un número")
    }
}