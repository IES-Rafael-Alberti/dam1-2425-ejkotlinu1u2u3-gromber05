import com.unidad1.basicos.*
import java.lang.NumberFormatException

fun unidad01() {
    var salir = false

    while (!salir) {
        println(
            """
        Unidad 1
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
                    Ejercicio04_U1()
                    esperarYBorrarConsola()
                }
                2 -> {
                empezarPrograma()
                Ejercicio06_U1()
                esperarYBorrarConsola()
            } 3 -> {
                empezarPrograma()
                Ejercicio12_U1()
                esperarYBorrarConsola()
            } 4 -> {
                empezarPrograma()
                Ejercicio15_U1()
                esperarYBorrarConsola()
            } 5 -> {
                empezarPrograma()
                Ejercicio18_U1()
                esperarYBorrarConsola()
            } 6 -> {
                empezarPrograma()
                Ejercicio20_U1()
                esperarYBorrarConsola()
            } 7 -> {
                empezarPrograma()
                Ejercicio21_U1()
                esperarYBorrarConsola()
            } 8 -> {
                empezarPrograma()
                Ejercicio22_U1()
                esperarYBorrarConsola()
            } 9 -> {
                empezarPrograma()
                Ejercicio24_U1()
                esperarYBorrarConsola()
            } 10 -> {
                empezarPrograma()
                Ejercicio25_U1()
                esperarYBorrarConsola()
            } 11 -> {
                empezarPrograma()
                Ejercicio26_U1()
                esperarYBorrarConsola()
            } 12 -> {
                empezarPrograma()
                Ejercicio27_U1()
                esperarYBorrarConsola()
            } 13 -> salir = true
                else -> {
                    empezarPrograma()
                    println("Opción no válida.")
                    esperarYBorrarConsola()
                }
            }
        }
        catch (numberFormatException: NumberFormatException) {
            println("No puedes introducir un valor vacío")
            esperarYBorrarConsola()
        }
        catch (e: Exception) {
            println("ERROR: $e")
            esperarYBorrarConsola()
        }
    }

}