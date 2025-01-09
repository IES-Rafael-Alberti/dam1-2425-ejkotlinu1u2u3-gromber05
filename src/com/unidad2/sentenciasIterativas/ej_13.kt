package com.unidad2.sentenciasIterativas

fun Ejercicio13_U2_1 () {
    var salir = false

    while (!salir) {
        print("Introduzca una línea >> ")
        val contenido = readln()
        if (contenido == "salir") {
            salir = true
        }
        else {
            println(contenido)
        }

    }
}