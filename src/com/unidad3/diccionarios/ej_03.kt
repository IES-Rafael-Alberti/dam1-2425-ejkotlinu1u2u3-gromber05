package com.unidad3.diccionarios

val FRUTAS = mapOf(
    "PLATANO" to 1.35,
    "MANZANA" to 0.80,
    "PERA" to 0.85,
    "NARANJA" to 0.70
)
fun Ejercicio03_U3_1() {
    val fruta = preguntarDato("la fruta") as String
    val cantidad = preguntarDato("cantidad") as Int

    val precio = hacerCalculo(fruta, cantidad)

    println("La fruta escogida ha sido $fruta y el precio total es de $precio")
}

fun preguntarDato(desc: String): Any {
    while (true) {
        try {
            print("Introduzca $desc >> ")
            val input = readLine()?.uppercase() ?: ""

            if (desc == "la fruta" && input !in FRUTAS.keys) {
                throw IndexOutOfBoundsException("La fruta introducida no es válida")
            }

            return if (desc == "cantidad") {
                input.toIntOrNull() ?: throw NumberFormatException("Debe ingresar un número válido")
            } else {
                input
            }

        } catch (e: Exception) {
            println("**ERROR** >> ${e.message}")
        }
    }
}

fun hacerCalculo(fruta: String, cantidad: Int): Double {
    return FRUTAS[fruta]?.times(cantidad) ?: 0.0
}


