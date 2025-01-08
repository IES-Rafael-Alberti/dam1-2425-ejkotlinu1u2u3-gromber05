package basicos

fun Ejercicio20_U1() {
    println("Introduzca un numero con el siguiente formato (+XX-XXXXXXXXX-XX) >> ")
    try {

        val numero = readln()
        val numero1 = procesarNumero(numero = numero)

        println(numero1?.get(1))

    } catch (e: NumberFormatException) {
        println("ERROR: ${e.message}")
    }
}

fun procesarNumero(numero: String): List<String>? {
    return if (numero.count { it == '-' } == 2 && numero.count { it == '+' } == 1 && numero.length == 16) {
        numero.split('-')
    } else {
        println("El número introducido no es válido o no se ha introducido de manera correcta.")
        return null
    }
}
