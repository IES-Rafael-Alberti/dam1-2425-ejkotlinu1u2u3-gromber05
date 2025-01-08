fun unidad01() {
    var salir = false

    while (!salir) {
        println(
            """
        1. Ejercicio 4
        2. Ejercicio 6
        3. Ejercicio 12
        4. Ejercicio 15
        5. Ejercicio 18
        6. Ejercicio 20
        7. Ejercicio 21
        8. Ejercicio 22
        9. Ejercicio 24
        10. Ejercicio 25
        11. Ejercicio 26
        12. Ejercicio 27
        13. Salir
        Seleccione la opción que desee >> 
        """.trimIndent()
        )
        try {
            val opcion = readln().toInt()

            // Todas las opciones del menú de actividades.
            when (opcion) {
                1 -> {
                    empezarPrograma()
                    Ejercicio04()
                    esperarYBorrarConsola()
                } 2 -> {
                empezarPrograma()
                Ejercicio06()
                esperarYBorrarConsola()
            } 3 -> {
                empezarPrograma()
                Ejercicio12()
                esperarYBorrarConsola()
            } 4 -> {
                empezarPrograma()
                Ejercicio15()
                esperarYBorrarConsola()
            } 5 -> {
                empezarPrograma()
                Ejercicio18()
                esperarYBorrarConsola()
            } 6 -> {
                empezarPrograma()
                Ejercicio20()
                esperarYBorrarConsola()
            } 7 -> {
                empezarPrograma()
                Ejercicio21()
                esperarYBorrarConsola()
            } 8 -> {
                empezarPrograma()
                Ejercicio22()
                esperarYBorrarConsola()
            } 9 -> {
                empezarPrograma()
                Ejercicio24()
                esperarYBorrarConsola()
            } 10 -> {
                empezarPrograma()
                Ejercicio25()
                esperarYBorrarConsola()
            } 11 -> {
                empezarPrograma()
                Ejercicio26()
                esperarYBorrarConsola()
            } 12 -> {
                empezarPrograma()
                Ejercicio27()
                esperarYBorrarConsola()
            } 13 -> salir = true
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