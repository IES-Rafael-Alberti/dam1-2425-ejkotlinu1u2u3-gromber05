package com.unidad3.listasYTuplas

fun Ejercicio08_U3() {
    println("Introduzca una palabra »» ")

    try {
        val palabra = pedirPalabra()

        if (esPalindromo(palabra)) {
            println("Es palindromo")
        } else {
            println("No es palindromo")
        }

    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun esPalindromo(palabra: String): Boolean {
    val palabra2 = palabra.lowercase()
    return palabra2 == palabra2.reversed()
}

fun pedirPalabra(): String {
    var palabra = ""

    try {
        palabra = readln()

        if (palabra.isEmpty()){
            throw IllegalArgumentException()
        }
        return palabra

    }
    catch (illegalArgumentException: IllegalArgumentException) {
        println("ERROR (No puedes introducir un espacio vacío): ${illegalArgumentException.message}")
    }
    catch (e: Exception) {
        println("ERROR: ${e.message}")
    }

    return palabra
}