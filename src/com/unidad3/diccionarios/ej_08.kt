package com.unidad3.diccionarios

val TRADUCCIONES = mutableMapOf<String, String>()

fun Ejercicio08_U3_1() {
    agregarTraducciones()
    mostrarDatos()

    print("Introduzca una frase a traducir >> ")
    val frase = readLine() ?: ""
    val fraseFinal = traducirFrase(frase)

    println("\nFrase traducida:")
    println(fraseFinal)
}

fun agregarTraducciones() {
    println("Si quiere finalizar las traducciones, introduzca un campo vacío.")
    print("Introduzca palabras en español y sus traducciones separadas por ':' y ',' por cada palabra >> ")

    val temp = readLine()?.lowercase()?.split(", ")

    temp?.forEach {
        if (it.contains(":")) {
            val (palabra, traduccion) = it.split(":")
            TRADUCCIONES[palabra.trim()] = traduccion.trim()
        } else {
            println("Formato incorrecto en '$it', debe ser 'palabra:traducción'")
        }
    }
}

fun mostrarDatos() {
    println("TRADUCCIONES")
    println("-----------------------\n")
    for ((palabra, traduccion) in TRADUCCIONES) {
        println("$palabra - $traduccion")
    }
}

fun traducirFrase(frase: String): String {
    val nuevaFrase = frase.split(" ").map { word ->
        TRADUCCIONES.getOrDefault(word, word)
    }

    return nuevaFrase.joinToString(" ")
}

