package sentenciasCondicionales

fun Ejercicio08_U2() {
    try {

        val puntuacion = pedirPuntuacion()

        println(verificarPuntuacion(puntuacion = puntuacion))

    } catch (exception: Exception) {
        println("ERROR: ${exception.message}")
    }
}

fun pedirPuntuacion(): Double {
    print("Introduzca su puntuacion >> ")
    val puntuacion = readln().toDouble()

    return puntuacion
}

fun verificarPuntuacion(puntuacion: Double) :String {

    var mensaje = ""
    if (puntuacion == 0.0) {
        mensaje = "Inaceptable"
        return mensaje
    }
    else if (puntuacion <= 0.4) {
        mensaje = "Aceptable"
        return mensaje
    }
    else if (puntuacion >= 0.6) {
        mensaje = "Meritorio"
        return mensaje
    }

    return mensaje
}