package com.unidad3.listasYTuplas

fun Ejercicio10_U3() {
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)
    try {
        val longitud = precios.size
        val preciosOrdenados = precios.sorted()

        println("El menos es ${preciosOrdenados[0]} y el mayor es ${preciosOrdenados[longitud - 1]}")
    }
    catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}