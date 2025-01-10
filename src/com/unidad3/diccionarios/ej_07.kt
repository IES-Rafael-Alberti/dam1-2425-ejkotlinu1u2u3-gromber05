package com.unidad3.diccionarios

var listaCompra = mutableMapOf<String, Int>()

fun Ejercicio07_U3_1() {
    println("Si quiere finalizar la compra, introduzca un campo vacío")
    pedirListaCompra()

    mostrarDatosCompra()
}

fun pedirListaCompra() {
    var salir = false

    while (!salir) {
        val compra = preguntaCompra("un artículo")

        if (compra.isEmpty()) {
            salir = true
        } else {
            val precio = preguntaCompra("el precio de $compra").toInt()
            listaCompra[compra] = precio
        }
    }
}

fun preguntaCompra(texto: String): String {
    print("Introduce $texto: ")
    return readLine() ?: ""
}

fun mostrarDatosCompra() {
    repeat(50){
        println("")
    }

    var serie = ""
    var totalCoste = 0.0

    println("Lista de la compra")
    println("-----------------------\n")

    for ((producto, precio) in listaCompra) {
        serie += "$producto - $precio\n"
        totalCoste += precio.toDouble()
    }

    println(serie)
    println("Total - $totalCoste €")
}



