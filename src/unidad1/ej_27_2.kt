package unidad1

fun Ejercicio27_U1() {
    println("Introduzca aquí el nombre del producto >> ")

    try {
        val producto = readln()

        println("Introduzca el precio del producto >> ")
        val precio = readln().toFloat()

        println("Introduzca la cantidad del producto >> ")
        val cantidad = readln().toInt()

        val precioTotal = precio * cantidad

        cadenaATexto(producto, precio, precioTotal, cantidad)

    } catch(e:Exception) {
        println("ERROR: ${e.message}")
    }
}

fun cadenaATexto (producto: String, precio: Float, precioTotal: Float, cantidad: Int ) {

    val newProducto = producto
    val newPrecio = String.format("%06.2f", precio)
    val newPrecioTotal = String.format("%08.2f", precioTotal)
    val newCantidad = String.format("%03d", cantidad)

    println("$newProducto, $newPrecio,  $newCantidad, $newPrecioTotal")
}
