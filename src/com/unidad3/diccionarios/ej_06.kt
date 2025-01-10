package com.unidad3.diccionarios

var DATOS = mutableMapOf<String, String?>()

fun Ejercicio06_U3_1() {
    for (i in 0 until 4) {
        when (i) {
            0 -> DATOS["NOMBRE"] = pregunta("nombre")
            1 -> DATOS["EDAD"] = pregunta("edad")
            2 -> DATOS["TELEFONO"] = pregunta("telefono")
            3 -> DATOS["DIRECCION"] = pregunta("direccion")
        }

        var serie = ""
        for ((j, k) in DATOS) {
            serie += "$j - $k, "
        }

        println(serie)
    }

    mostrarDatos(DATOS["NOMBRE"] ?: "", DATOS["EDAD"] ?: "", DATOS["TELEFONO"] ?: "", DATOS["DIRECCION"] ?: "")
}

fun pregunta(desc: String): String? {
    var respuestaCorrecta = false
    var respuesta: String? = ""

    while (!respuestaCorrecta) {
        println("Introduzca su $desc >> ")
        respuesta = readlnOrNull()

        if (respuesta.isNullOrEmpty()) {
            println("No puedes no introducir nada")
        } else {
            respuestaCorrecta = true
        }
    }
    return respuesta
}


fun mostrarDatos(nombre: String, edad: String, telefono: String, direccion: String) {
    println("\n$nombre tiene $edad años, vive en $direccion y su número de teléfono es $telefono")
}