package sentenciasIterativas

fun Ejercicio15_U2_1(){
    var salir = false
    var resultado = 0

    while (!salir) {
        println("Introduzca un número >> ")
        val contenido = readln().toInt()

        if (contenido == 0) {
            println("Resultado: $resultado")
            salir = true
        }
        else {
            resultado += contenido
        }
    }
}