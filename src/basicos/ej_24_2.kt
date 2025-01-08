package basicos

fun Ejercicio24_U1() {
    println("Introduzca el precio del producto con dos decimales >> ")

    try {
        val precio = readln().toFloat()

        val newprecio = precio.toString().split('.')

        val euros = newprecio[0]
        val centimos = newprecio[1]

        println("El precio ha sido de $euros euros y $centimos centimos")


    } catch (exception: Exception) {
        println("Error: $exception")
    }
}