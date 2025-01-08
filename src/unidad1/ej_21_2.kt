package unidad1

fun Ejercicio21_U1(){
    println("Introduzca una frase >> ")

    try {
        val frase = readln()
        if (frase.isBlank()) {
            println("Error: No has introducido ningún valor.")
            return
        }

        println(frase.reversed())

    } catch (exception: Exception) {
        println("ERROR: ${exception.message}")
    }
}