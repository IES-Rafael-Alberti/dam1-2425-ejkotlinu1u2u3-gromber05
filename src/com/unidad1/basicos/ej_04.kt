package com.unidad1.basicos

fun Ejercicio04_U1() {
    println("Introduce los grados Celsius:")

    try {
        val input = readln()
        if (input.isBlank()) {
            println("Error: No has introducido ningún valor.")
            return
        }

        val celsius = input.toFloat()
        val fahrenheit = gradosAFahrenheit(grados = celsius)
        println("Fahrenheit: $fahrenheit")
    } catch (e: NumberFormatException) {
        println("Error: Debes introducir un número válido.")
    }
}

fun gradosAFahrenheit(grados: Float): Float {
    return grados * 9 / 5 + 32
}
