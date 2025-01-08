package unidad1

fun Ejercicio25_U1() {

    println("Introduzca aquí su fecha de nacimiento (DD/MM/AAAA) >> ")

    try {
        val fecha = readln().split("/")

        val dia = fecha[0]
        val mes = fecha[1]
        val ano = fecha[2]

        println("$dia $mes, $ano")

    } catch (exception: Exception) {
        println("ERROR: $exception")
    }
}