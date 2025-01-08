package basicos

fun Ejercicio22_U1(){

    println("Introduzca una frase >> ")

    try {
        val frase = readln()
        if (frase.isBlank()) {
            println("Error: No has introducido ningún valor.")
            return
        }

        println("Introduzca una vocal >> ")
        val vocal = readln()
        if (vocal.isBlank()) {
            println("Error: No has introducido ningún valor.")
            return
        }

        println(frase.replace(vocal, vocal.uppercase()))
    } catch (e: Exception) {
        println(e.message)
    }
}