package basicos

fun Ejercicio15_U1() {
    print("Introduzca su salario » ")
    try {
        val input = readln()
        if (input.isBlank()) {
            println("Error: No has introducido ningún valor.")
            return
        }

        val salario = input.toDouble()

        val primerAnio = calcularIntereses(salario, 1.4)
        val segundoAnio = calcularIntereses(primerAnio, 1.4)
        val tercerAnio = calcularIntereses(segundoAnio, 1.4)

        println("Primer año: $primerAnio")
        println("Segundo año: $segundoAnio")
        println("Tercer año: $tercerAnio")

    }
    catch (e: NumberFormatException) {
        println("ERROR: ${e.message}")
    }
}

fun calcularIntereses(salario: Double, intereses: Double): Double {
    return salario * intereses
}