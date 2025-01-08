package sentenciasCondicionales

fun Ejercicio03_U2() {
    println("Introduzca el dividendo >> ")

    try {
        val dividendo = readln().toInt()

        println("Introduzca el divisor >> ")
        val divisor = readln().toInt()

        val resultado = realizarDivision(dividendo = dividendo, divisor = divisor)

        if (resultado == null) {
            println("El divisor no puede ser cero")
        } else {
            println("El resultado es $resultado")
        }
    } catch (exception: Exception) {
        println("ERROR: ${exception.message}")
    }

}

fun realizarDivision (dividendo:Int, divisor:Int) : Float? {

    if (divisor == 0 ) {
        return null
    } else {
        val resultado = (dividendo / divisor).toFloat()
        return resultado
    }
}