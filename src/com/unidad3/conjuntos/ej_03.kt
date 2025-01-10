package com.unidad3.conjuntos

fun Ejercicio03_U3_2() {
    println(conjuntoPotencia(setOf(6, 1, 4)))
}

fun conjuntoPotencia(conjunto: Set<Int>): List<Set<Int>> {
    val listaConjunto = conjunto.toList()
    val potencia = mutableListOf<Set<Int>>()
    potencia.add(emptySet())

    for (elemento in listaConjunto) {
        val nuevosSubconjuntos = mutableListOf<Set<Int>>()
        for (subconjunto in potencia) {
            val nuevoSubconjunto = subconjunto + elemento
            nuevosSubconjuntos.add(nuevoSubconjunto)
        }
        potencia.addAll(nuevosSubconjuntos)
    }

    return potencia
}