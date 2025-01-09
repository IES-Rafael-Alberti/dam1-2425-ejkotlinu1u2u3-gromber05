import com.unidad3.*

fun unidad03() {
    var salir = false

    while (!salir) {
        println(
            """
        Unidad 3
        Listas y Tuplas
        1. Ejercicio 2
        2. Ejercicio 3
        3. Ejercicio 6
        4. Ejercicio 8
        5. Ejercicio 10
        Diccionarios
        6. Ejercicio 2
        7. Ejercicio 4
        8. Ejercicio 6
        9. Ejercicio 7
        10. Ejercicio 8
        11. Ejercicio 13
        12. Ejercicio 15
        13. Ejercicio 18
        14. Ejercicio 19
        15. Ejercicio 25
        Conjuntos
        16. Ejercicio 2
        17. Ejercicio 3
        18. Ejercicio 4
        19. Salir
        Seleccione la opción que desee >> 
        """.trimIndent()
        )
        try {
            val opcion = readln().toInt()

            // Todas las opciones del menú de actividades.
            when (opcion) {

            19 -> salir = true
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

