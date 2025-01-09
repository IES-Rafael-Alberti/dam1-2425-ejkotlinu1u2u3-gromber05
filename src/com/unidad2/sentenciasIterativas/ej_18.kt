package com.unidad2.sentenciasIterativas

fun Ejercicio18_U2_1 (){
    var contadorPares = 0
    var salir = false

    while (!salir) {
        println("Ingrese un número positivo (-1 para terminar) »» ")
        val input = readln().toInt()

        if (input == -1) {
            salir = true
        }

        if (input < 0) {
            println("El número no puede ser negativo")
        }

        val suma = sumaDeDigitos(entrada = input)
        println("La suma de los dígitos del número $input es: $suma")

        if (input % 2 == 0) {
            contadorPares++
        }
    }

    println("Cantidad de número pares que se han ingresado: $contadorPares")
}

fun sumaDeDigitos(entrada: Int) : Int {
    val temp = entrada.toString().map { it.digitToInt() }.sum()
    return temp
}