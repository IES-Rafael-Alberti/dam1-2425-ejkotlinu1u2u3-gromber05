package com.unidad3.diccionarios

var ASIGNATURAS = mutableMapOf<String, Int>()

fun Ejercicio05_U3_1 () {
    var salir = false
    var creditosTotales = 0

    while (!salir) {
        try {
            val asignatura = preguntarAsignatura()

            if (asignatura == " ") {
                salir = true
                println(mostrarCreditosTotales(ASIGNATURAS, creditosTotales))
            }
            else {
                val creditos = preguntarCreditos()
                creditosTotales += creditos
            }
        }
        catch (e: Exception) {
            println("ERROR: ${e.message}")
        }
    }
}

fun preguntarAsignatura() : String {
    var resp = ""

    try {
        println("Introduzca una asignatura »» ")

        resp = readln()
        return resp
    }
    catch (i: IndexOutOfBoundsException) {
        println(i)
    }
    catch (e: Exception) {
        println("ERROR ${e.message}")
    }
    return resp
}

fun preguntarCreditos(): Int {
    var resp = 0

    try {
        println("Introduzca los créditos que vale esa asignatura »» ")

        resp = readln().toInt()
    }
    catch (i: IndexOutOfBoundsException) {
        println(i)
    }
    catch (e: Exception) {
        println("ERROR ${e.message}")
    }

    return resp
}

fun mostrarCreditosTotales (asignaturas: Map<String, Int>, creditosTotales: Int) : ArrayList<String> {
    val serie = ArrayList<String>()

    for ((k, v) in asignaturas) {
        serie += "$k - $v créditos, "
    }

    serie += "los créditos totales son »» $creditosTotales"

    return serie
}