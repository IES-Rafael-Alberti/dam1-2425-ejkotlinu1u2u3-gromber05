package com.unidad3.conjuntos

fun Ejercicio04_U3_2() {
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()

    val (frutasComunes, frutasSoloEnFrutas1, frutasSoloEnFrutas2) = encontrarComunes(setFrutas1, setFrutas2)

    println("Frutas comunes: $frutasComunes")
    println("Frutas solo en frutas1: $frutasSoloEnFrutas1")
    println("Frutas solo en frutas2: $frutasSoloEnFrutas2")
}

fun encontrarComunes(setFrutas1: Set<String>, setFrutas2: Set<String>): Triple<Set<String>, Set<String>, Set<String>> {
    val frutasComunes = setFrutas1 intersect setFrutas2
    val frutasSoloEnFrutas1 = setFrutas1 subtract setFrutas2
    val frutasSoloEnFrutas2 = setFrutas2 subtract setFrutas1

    return Triple(frutasComunes, frutasSoloEnFrutas1, frutasSoloEnFrutas2)
}