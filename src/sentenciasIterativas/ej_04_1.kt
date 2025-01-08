package sentenciasIterativas

fun Ejercicio04_U2_1() {

    val numero = pedirNumero()
    val serie = mutableListOf<String>()
    try {
        for (i in numero downTo 1) {
            serie.add("$i")
        }

        println(serie.joinToString(", "))

    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun pedirNumero(): Int {
    var respuestaValida = false
    var numero: Int = 0

    while (!respuestaValida) {
        print("Introduzca un numero >> ")

        try {
            val input = readln()

            if (input.isBlank()) {
                println("El valor introducido no puede estar vacío. Inténtelo de nuevo.")
            } else {
                numero = input.toInt()
                respuestaValida = true
            }

        } catch (e: NumberFormatException) {
            println("**ERROR** Entrada inválida. Por favor, introduzca un número válido.")
        }
    }

    return numero
}
