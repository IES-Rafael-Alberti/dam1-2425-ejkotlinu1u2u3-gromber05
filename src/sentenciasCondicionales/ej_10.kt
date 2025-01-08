package sentenciasCondicionales

fun Ejercicio10_U2(){
    print("¿Quiere usted una pizza vegana? (s/n) >> ")

    try {
        val n = readln().lowercase()
        var vegetariana = true

        println("Recordatorio: Siempre trae mozarella y tomate")
        if (n == "s") {
            println("Ingredientes vegetarianos: Pimiento y tofu")
        }
        else if (n == "n") {
            println("Ingredientes no vegetarianos: Peperoni, Jamón Salmón")
            vegetariana = false
            return
        }

        println("Escoja un ingrediente >> ")

        val ingrediente = readln()

        imprimirPizza(vegetariana, ingrediente)

    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun imprimirPizza (vegetariana: Boolean, ingrediente: String){
    if (vegetariana) {
        println("Pizza vegetariana con tomate, mozarella, $ingrediente")
    }
    else {
        println("Pizza no vegetariana con tomate, mozarella, $ingrediente")
    }
}