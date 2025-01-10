package com.unidad2.capturaExcepciones

fun Ejercicio04_U2_2() {
    println("Introduzca un número entero y positivo »» ")

    try {
        val input = readln().toInt()

        if (input < 0) {
            throw NumberFormatException()
        } else {
            println("El número introducido $input es correcto")
        }

    }
    catch (nfe: NumberFormatException) {
        println("La entrada no es correcta »» $nfe")
    }
}