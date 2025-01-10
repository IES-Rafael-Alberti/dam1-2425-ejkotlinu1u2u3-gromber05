package com.unidad2.sentenciasIterativas

fun Ejercicio25_U2_1() {
    println("Introduzca una frase »» ")

    try {
        val input = readln()
        if (input.equals("")) {
            throw IllegalArgumentException()
        }

        val palabras = input.split(" ")

        val palabraMasLarga = palabras.maxByOrNull { it.length }
        val totalPalabras = palabras.size

        println("La palabra más larga es: $palabraMasLarga")
        println("El total de palabras es: $totalPalabras")
    }
    catch (ErrorParametro: IllegalArgumentException) {
        println("No puedes introducir un campo vacío")
    }
}