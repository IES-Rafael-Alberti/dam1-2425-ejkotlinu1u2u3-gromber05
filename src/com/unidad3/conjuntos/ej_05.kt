package com.unidad3.conjuntos

fun Ejercicio05_U3_2() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = crearPares(numeros)
    val multiplosDeTres = crearMultiploTres(numeros)
    val paresYMultiplosDeTres = pares intersect multiplosDeTres

    println("Pares: $pares")
    println("Múltiplos de tres: $multiplosDeTres")
    println("Comunes: $paresYMultiplosDeTres")
}

fun crearPares(numeros: Set<Int>): Set<Int> {
    return numeros.filter { it % 2 == 0 }.toSet()
}

fun crearMultiploTres(numeros: Set<Int>): Set<Int> {
    return numeros.filter { it % 3 == 0 }.toSet()
}