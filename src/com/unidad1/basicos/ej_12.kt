package com.unidad1.basicos

fun Ejercicio12_U1() {

    try {
        println("Introduzca su peso en kg (68.9 kg) » ")
        val inputPeso = readln()
        if (inputPeso.isBlank()) {
            println("Error: No has introducido un valor para el peso.")
            return
        }
        val kilogramosFinal = inputPeso.toFloat()

        println("Introduzca su estatura en metros (1.85m) » ")
        val inputEstatura = readln()
        if (inputEstatura.isBlank()) {
            println("Error: No has introducido un valor para la estatura.")
            return
        }
        val estatura = inputEstatura.toFloat()
        val totalIMC = calcularIMC(peso = kilogramosFinal, estatura = estatura)

        println("Su IMC es: $totalIMC")

    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun calcularIMC(peso: Float, estatura: Float): Float {
    return peso / (estatura * estatura)
}
