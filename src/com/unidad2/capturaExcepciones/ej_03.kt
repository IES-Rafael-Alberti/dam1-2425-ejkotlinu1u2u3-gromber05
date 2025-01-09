package com.unidad2.capturaExcepciones

fun Ejercicio03_U2_2() {
    val input = pedirNumero(msj = "Introduzca un número »» ")

    for (num in input downTo 0){
        if (input == 0){
            print("$num")
        }
        else {
            print("$num, ")
        }

    }

}

