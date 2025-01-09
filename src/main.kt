
fun main () {
    var salir = false

    while (!salir) {
        println(
            """
        Unidades
        1. Unidad 1
        2. Unidad 2
        3. Unidad 3
        4. Salir
        Seleccione la opción que desee >> 
        """.trimIndent()
        )
        try {
            val opcion = readln().toInt()

            // Todas las opciones del menú de actividades.
            when (opcion) {
                1 -> {
                    empezarPrograma()
                    unidad01()
                    esperarYBorrarConsola()
                }
                2 -> {
                    empezarPrograma()
                    unidad02()
                    esperarYBorrarConsola()
                }
                3 -> {
                    empezarPrograma()
                    unidad03()
                    esperarYBorrarConsola()
                }
                4 -> salir = true
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


fun esperarYBorrarConsola() {
    println("\nPresiona Enter para continuar...")
    readln()

    repeat(50){
        println()
    }
}

fun empezarPrograma(){
    repeat(50){
        println()
    }
}