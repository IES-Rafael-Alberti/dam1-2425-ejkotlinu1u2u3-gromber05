package com.unidad2.sentenciasIterativas

fun Ejercicio07_U2_1() {

    val numero = pedirNumero()

    try {
        println("Tabla del $numero")

        for (i in 0 until 11) {
            val resultado = calculo(i = i,numero = numero)
            println("$numero × $i = $resultado")
        }
    } catch (e : Exception) {
        println("ERROR: ${e.message}")
    }
}

fun calculo(i: Int, numero: Int): Int {
    return numero * i
}