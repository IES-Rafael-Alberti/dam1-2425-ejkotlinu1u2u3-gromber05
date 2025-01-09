import sentenciasCondicionales.*
import sentenciasIterativas.*

fun unidad02() {
    var salir = false

    while (!salir) {
        println(
            """
        Unidad 2
        Sentencias Condicionales
        1. Ejercicio 2
        2. Ejercicio 3
        3. Ejercicio 6
        4. Ejercicio 8
        5. Ejercicio 10
        Sentencias Iterativas
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
        Capturas de excepciones
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
            1 -> {
                empezarPrograma()
                Ejercicio02_U2()
                esperarYBorrarConsola()
            }
            2 -> {
                empezarPrograma()
                Ejercicio03_U2()
                esperarYBorrarConsola()
            }
            3 -> {
                empezarPrograma()
                Ejercicio06_U2()
                esperarYBorrarConsola()
            }
            4 -> {
                empezarPrograma()
                Ejercicio08_U2()
                esperarYBorrarConsola()
            }
            5 -> {
                empezarPrograma()
                Ejercicio10_U2()
                esperarYBorrarConsola()
            }
            6 -> {
                empezarPrograma()
                Ejercicio02_U2_1()
                esperarYBorrarConsola()
            }
            7 -> {
                empezarPrograma()
                Ejercicio04_U2_1()
                esperarYBorrarConsola()
            }
            8 -> {
                empezarPrograma()
                Ejercicio06_U2_1()
                esperarYBorrarConsola()
            }
            9 -> {
                empezarPrograma()
                Ejercicio07_U2_1()
                esperarYBorrarConsola()
            }
            10 -> {
                empezarPrograma()
                Ejercicio08_U2_1()
                esperarYBorrarConsola()
            }
            11 -> {
                empezarPrograma()
                Ejercicio13_U2_1()
                esperarYBorrarConsola()
            }
            12 -> {
                empezarPrograma()
                Ejercicio15_U2_1()
                esperarYBorrarConsola()
            }
            13 -> {
                empezarPrograma()
                Ejercicio18_U2_1()
                esperarYBorrarConsola()
            }
            14 -> {
                empezarPrograma()
                Ejercicio19_U2_1()
                esperarYBorrarConsola()
            }
            15 -> {
                empezarPrograma()
                Ejercicio25_U2_1()
                esperarYBorrarConsola()
            }
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

