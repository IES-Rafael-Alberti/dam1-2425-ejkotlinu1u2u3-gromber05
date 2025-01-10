package com.menu
import com.unidad3.listasYTuplas.*
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

            // Todas las opciones del menú de actividades.
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

