package basicos

fun Ejercicio06_U1() {
    println("Introduce el precio con IVA (0.10%): ")

    try {
        val input = readln()
        if (input.isBlank()) {
            println("Error: No has introducido ningún valor.")
            return
        }

        val precio = input.toFloat()
        val ivaCalculado = calcularIva(precio = precio)
        val precioFinal = precio - ivaCalculado

        println("El Precio sin IVA calculado es: $precioFinal")
    }
    catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun calcularIva(precio: Float): Float {
    return precio * 0.10f
}