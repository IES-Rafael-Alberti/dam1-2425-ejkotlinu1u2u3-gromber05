package com.unidad2.sentenciasIterativas

fun Ejercicio19_U2_1 () {
    var salir = false

    while (!salir) {
        println(
            """
        1. Iniciar programa
        2. Imprimir listado
        3. Salir del programa
        Seleccione la opción que desee >> 
        """.trimIndent()
        )

        val opcion = readln().toInt()
        when (opcion) {
            1 -> {
                println("Iniciando programa")
            }
            2 -> {
                println("Imprimiendo listado")
            }
            3 -> {
                salir = true
            }
            else -> {
                println("Opción no válida, por favor, escoja otra opción")
            }
        }
    }

}