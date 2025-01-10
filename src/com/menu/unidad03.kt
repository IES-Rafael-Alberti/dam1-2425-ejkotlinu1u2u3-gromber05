package com.menu

import com.unidad3.diccionarios.*
import com.unidad3.listasYTuplas.*
import com.unidad3.conjuntos.*

import empezarPrograma
import esperarYBorrarConsola

fun unidad03() {
    var salir = false

    while (!salir) {
        println(
            """
        Unidad 3
        Listas y Tuplas
        1. Ejercicio 4
        2. Ejercicio 6
        3. Ejercicio 8
        4. Ejercicio 9
        5. Ejercicio 10
        6. Ejercicio 13
        Diccionarios
        7. Ejercicio 3
        8. Ejercicio 5
        9. Ejercicio 6
        10. Ejercicio 7
        11. Ejercicio 8
        12. Ejercicio 10
        13. Ejercicio 11
        Conjuntos
        14. Ejercicio 1
        15. Ejercicio 2
        16. Ejercicio 3
        17. Ejercicio 4
        18. Ejercicio 5
        19. Ejercicio 6
        20. Salir
        Seleccione la opción que desee >> 
        """.trimIndent()
        )
        try {
            val opcion = readln().toInt()

            when (opcion) {
                1 -> {
                    empezarPrograma()
                    Ejercicio04_U3()
                    esperarYBorrarConsola()
                }
                2 -> {
                    empezarPrograma()
                    Ejercicio06_U3()
                    esperarYBorrarConsola()
                }
                3 -> {
                    empezarPrograma()
                    Ejercicio08_U3()
                    esperarYBorrarConsola()
                }
                4 -> {
                    empezarPrograma()
                    Ejercicio09_U3()
                    esperarYBorrarConsola()
                }
                5 -> {
                    empezarPrograma()
                    Ejercicio10_U3()
                    esperarYBorrarConsola()
                }
                6 -> {
                    empezarPrograma()
                    Ejercicio13_U3()
                    esperarYBorrarConsola()
                }
                7 -> {
                    empezarPrograma()
                    Ejercicio03_U3_1()
                    esperarYBorrarConsola()
                }
                8 -> {
                    empezarPrograma()
                    Ejercicio05_U3_1()
                    esperarYBorrarConsola()
                }
                9 -> {
                    empezarPrograma()
                    Ejercicio06_U3_1()
                    esperarYBorrarConsola()
                }
                10 -> {
                    empezarPrograma()
                    Ejercicio07_U3_1()
                    esperarYBorrarConsola()
                }
                11 -> {
                    empezarPrograma()
                    Ejercicio08_U3_1()
                    esperarYBorrarConsola()
                }
                12 -> {
                    empezarPrograma()
                    Ejercicio10_U3_1()
                    esperarYBorrarConsola()
                }
                13 -> {
                    empezarPrograma()
                    Ejercicio11_U3_1()
                    esperarYBorrarConsola()
                }
                14 -> {
                    empezarPrograma()
                    Ejercicio01_U3_2()
                    esperarYBorrarConsola()
                }
                15 -> {
                    empezarPrograma()
                    Ejercicio02_U3_2()
                    esperarYBorrarConsola()
                }
                16 -> {
                    empezarPrograma()
                    Ejercicio03_U3_2()
                    esperarYBorrarConsola()
                }
                17 -> {
                    empezarPrograma()
                    Ejercicio04_U3_2()
                    esperarYBorrarConsola()
                }
                18 -> {
                    empezarPrograma()
                    Ejercicio05_U3_2()
                    esperarYBorrarConsola()
                }
                19 -> {
                    empezarPrograma()
                    Ejercicio06_U3_2()
                    esperarYBorrarConsola()
                }
                20 -> salir = true
                else -> {
                    empezarPrograma()
                    println("Opción no válida.")
                    esperarYBorrarConsola()
                }
            }
        }
        catch (NumberFormatException: java.lang.NumberFormatException) {
            println("No puedes introducir un valor vacío")
            esperarYBorrarConsola()
        }
        catch (e: Exception) {
            println("ERROR: $e")
            esperarYBorrarConsola()
        }
    }
}

