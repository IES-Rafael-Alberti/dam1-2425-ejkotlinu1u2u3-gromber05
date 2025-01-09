package com.unidad2.capturaExcepciones

fun Ejercicio02_U2_2() {
    val input = pedirNumero(msj = "Introduzca un número »» ")

    for (num in 1..input step 2){
        print("$num")
    }

}

fun pedirNumero(msj: String) : Int {
    println(msj)
    var input = ""

    try {
        input = readln()
        return input.toInt()

    } catch (e: Exception){
        println("ERROR: ${e.message}")
    }

    return input.toInt()
}