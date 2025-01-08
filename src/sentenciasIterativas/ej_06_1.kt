package sentenciasIterativas

fun Ejercicio06_U2_1() {

    val numero = pedirNumero()

    try {
        for (i in 0 until numero) {
            println(bucle(i))
        }

    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun bucle(i: Int): String {
    var serie = ""
    for (j in 0 until i+1) {
        serie += "*"
    }
    return serie
}