package unidad1

fun Ejercicio26_U1() {
    println("Introduzca aquí su cesta de la compra separada por comas >> ")

    try {
        val lista = readln().split(", ")

        for (producto in lista) {
            println(producto)
        }
    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}