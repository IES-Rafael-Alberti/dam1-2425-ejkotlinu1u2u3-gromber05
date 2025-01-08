package sentenciasIterativas

fun Ejercicio08_U2_1() {
    val numero = pedirNumero()
    var serie = ""

    try {
        for (i in 0 until numero) {
            if (numero % 2 != 0) {
                serie += "$i "
                println(serie)
            }
        }
    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}
