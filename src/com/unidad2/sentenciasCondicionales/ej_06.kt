package com.unidad2.sentenciasCondicionales

fun Ejercicio06_U2() {
    try {
        val sexo = pedirSexo()
        val nombre = pedirNombre()

        val abecedario1 = listOf(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
        )

        val abecedario2 = listOf(
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        )

        if (sexo == "mujer" && nombre[0] in abecedario1) {
            println("Estás en la clase A")
        }
        else if (sexo == "hombre" && nombre[0] in abecedario2) {
            println("Estás en la clase A")
        }
        else if (sexo == "mujer" && nombre[0] in abecedario2) {
            println("Estás en la clase B")
        }
        else if (sexo == "hombre" && nombre[0] in abecedario1) {
            println("Estás en la clase B")
        }

    }
    catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun pedirSexo (): String {
    println("Introduzca su sexo (mujer o hombre): ")

    val sexo = readln().lowercase()
    return sexo
}

fun pedirNombre (): String {
    println("Introduzca su nombre: ")

    val nombre = readln().lowercase()
    return nombre
}