package sentenciasIterativas

fun Ejercicio02_U2_1() {

    val edad = pedirEdad()

    try {
        println("La edad que has cumplido hasta ahora es: ")
        for (i in 1..edad){
            print("$i ")
        }
    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun pedirEdad(): Int {
    var respuestaValida = false
    var edad = 0

    while (!respuestaValida) {
        print("Introduzca su edad >> ")

        try {
            val input = readln()

            if (input.isBlank()) {
                println("El valor introducido no puede estar vacío. Inténtelo de nuevo.")
            } else {
                edad = input.toInt()
                respuestaValida = true
            }

        } catch (e: NumberFormatException) {
            println("**ERROR** Entrada inválida. Por favor, introduzca un número válido.")
        }
    }

    return edad
}

