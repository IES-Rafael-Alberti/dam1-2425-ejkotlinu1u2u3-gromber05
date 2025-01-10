package com.unidad3.listasYTuplas

val VOCAL = mutableMapOf(
    'a' to 0,
    'e' to 0,
    'i' to 0,
    'o' to 0,
    'u' to 0
)

fun Ejercicio09_U3() {
    println("Introduzca una palabra »» ")
    try {
        val palabra = pedirPalabra()
        contarVocales(palabra = palabra)

        println("Hay una cantidad de: \n${VOCAL['a']} - a, \n${VOCAL['e']} - e, \n${VOCAL['i']} - i, \n${VOCAL['o']} - o, \n${VOCAL['u']} - u.")
    }
    catch (ilegal: IllegalArgumentException) {
        println("ERROR: ${ilegal.message}")
    }
    catch (e: Exception) {
        println("ERROR: ${e.message}")
    }

}

fun contarVocales (palabra: String) {
    val separada = palabra

    for (letra in separada) {
        when (letra) {
            'a' -> VOCAL['a'] = VOCAL['a']!! + 1
            'e' -> VOCAL['e'] = VOCAL['e']!! + 1
            'i' -> VOCAL['i'] = VOCAL['i']!! + 1
            'o' -> VOCAL['o'] = VOCAL['o']!! + 1
            'u' -> VOCAL['u'] = VOCAL['u']!! + 1
        }
    }

}

