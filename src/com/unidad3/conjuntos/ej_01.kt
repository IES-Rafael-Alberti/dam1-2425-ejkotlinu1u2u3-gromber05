package com.unidad3.conjuntos

fun Ejercicio01_U3_2() {
    val datos = listOf(
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, 699, "Mirasol 218"),
        listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        listOf("Jorge Russo", 15, 958, "Mirasol 218")
    )

    val datazo = obtenerDatos(datos)

    println("Los domicilios a los que se deben enviar facturas son: $datazo")
}

fun obtenerDatos(compras: List<List<Any>>): List<String> {
    val domicilios = mutableMapOf<String, String>()

    for (compra in compras) {
        val cliente = compra[0] as String
        val domicilio = compra[3] as String

        if (cliente !in domicilios) {
            domicilios[cliente] = domicilio
        }
    }

    return domicilios.values.toList()
}

