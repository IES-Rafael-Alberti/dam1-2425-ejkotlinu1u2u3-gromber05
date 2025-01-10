package com.unidad3.conjuntos

fun Ejercicio06_U3_2() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val alfabeto = ('a'..'z').toSet()

    val consonantes = crearConsonantes(vocales, alfabeto)
    val letrasComunes = vocales intersect consonantes

    println("Vocales: $vocales")
    println("Consonantes: $consonantes")
    println("Comunes: $letrasComunes")
}

fun crearConsonantes(vocales: Set<Char>, alfabeto: Set<Char>): Set<Char> {
    return alfabeto.filter { it !in vocales }.toSet()
}