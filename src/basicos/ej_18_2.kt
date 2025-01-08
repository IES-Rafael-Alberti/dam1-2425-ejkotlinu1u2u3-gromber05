package basicos

fun Ejercicio18_U1() {
    println("Introduzca su nombre de usuario >> ")

    try {
        val nombreUsuario = readln()
        if (nombreUsuario.isBlank()) {
            println("Error: No has introducido ningún valor.")
            return
        }

        imprimirNombredeUsuario(nombreUsuario)

    }
    catch (e: NumberFormatException) {
        println("ERROR: ${e.message}")
    }
}

fun imprimirNombredeUsuario(nombreUsuario: String) {

    // Nombre de usuario con la primera en mayuscula.
    println(nombreUsuario.lowercase().replaceFirstChar { it.uppercase() })
    // Nombre de usuario con todas mayusculas
    println(nombreUsuario.uppercase())
    // Nombre de usuario con todas minusculas
    println(nombreUsuario.lowercase())
}

