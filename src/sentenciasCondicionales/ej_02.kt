package sentenciasCondicionales

fun Ejercicio02_U2() {
    println("Introduzca una contraseña >> ")

    try {
        val contrasenia = readln()
        val contraseniaGuardada = "contraseña"

        verificarContrasenia(contrasenia = contrasenia, contraseniaGuardada = contraseniaGuardada)

    } catch (exception: Exception) {
        println("ERROR: ${exception.message}")
    }
}

fun verificarContrasenia (contrasenia : String, contraseniaGuardada: String) {
    if (contraseniaGuardada == contrasenia) {
        println("La contraseña coincide")
    } else {
        println("La contraseña no coincide")
    }
}