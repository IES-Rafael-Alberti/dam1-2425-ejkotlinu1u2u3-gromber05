package com.unidad3.diccionarios

fun Ejercicio10_U3_1(){

    val clientes = mutableMapOf<String, Any>()
    var salir = false

    while (!salir) {
        try {
            val opcion = menu()

            when (opcion){
                1 -> {
                    clientes.putAll(agregarCliente())
                }
                2 -> {
                    clientes.putAll(borrarCliente(clientes))
                }
                3 -> {
                    val serie = mostrarCliente(clientes)
                    if (serie != null) {
                        println(serie)
                        Thread.sleep(4000)
                    }
                }
                4 ->{
                    val serie = mostrarClientes(clientes)
                    if (serie != null) {
                        println(serie)
                        Thread.sleep(4000)
                    }
                }
                5 -> {
                    val serie = mostrarClientesPreferentes(clientes)
                    if (serie != null) {
                        println(serie)
                        Thread.sleep(4000)
                    }
                }
                6 -> {
                    salir = preguntarSalir()
                }
            }

        }
        catch (e: Exception) {
                println("ERROR: ${e.message}")
        }
    }
}

fun menu(): Int{
    println("\nBase de datos\n\n1.- Ingresar cliente\n2.- Eliminar cliente\n3.- Mostrar cliente\n4.- Lista de todos los clientes\n5.- Mostrar los clientes preferentes\n6.- Salir del programa\n")

    var respuesta = false
    var opcion = -1
    val opcionesDisponibles = listOf(1, 2, 3, 4, 5, 6)

    while (!respuesta) {
        try {
            opcion = readln().toInt()

            if (opcion in opcionesDisponibles){
                respuesta = true
            } else {
                throw IndexOutOfBoundsException()
            }
        }
        catch (index: IndexOutOfBoundsException){
            println("La opción no es válida, por favor, escoja una opción válida")
        }
        catch (e: Exception) {
            println("ERROR: ${e.message}")
        }
    }

    return opcion
}

fun preguntarSalir (): Boolean {
    var salir = false
    println("¿De verdad quieres salir? (s/n) »» ")

    try {
        val opcion = readln().lowercase()
        when (opcion) {
            "s" -> {
                salir = true
            }
            "n" -> {
                salir = false
            }
            else -> {
                throw IndexOutOfBoundsException()
            }
        }
    }
    catch (index: IndexOutOfBoundsException) {
        println("ERROR")
    }

    return salir
}

fun agregarCliente(): MutableMap<String, MutableMap<String, Any>> {
    limpiarConsola()
    println("Agregar un cliente...")

    val plantilla = mutableMapOf<String, MutableMap<String, Any>>()

    val nif = preguntarNif()

    plantilla[nif] = mutableMapOf(
        "nombre" to "",
        "direccion" to "",
        "telefono" to "",
        "email" to "",
        "preferente" to false
    )

    for (key in plantilla[nif]!!.keys) {
        when (key) {
            "nombre" -> plantilla[nif]!![key] = preguntarDato("su nombre").toString()
            "direccion" -> plantilla[nif]!![key] = preguntarDato("su dirección").toString()
            "telefono" -> plantilla[nif]!![key] = preguntarDato("su teléfono").toString()
            "email" -> plantilla[nif]!![key] = preguntarDato("su email").toString()
            "preferente" -> plantilla[nif]!![key] = preguntarPreferente()
        }
    }

    limpiarConsola()
    return plantilla

}

fun borrarCliente(lista: MutableMap<String, Any>): Map<out String, Any> {
    limpiarConsola()
    println("Borrado de cliente...")

    try {
        val nif = preguntarNif()

        if (lista.containsKey(nif)){
            lista.remove(nif)
        }
        else {
            throw IndexOutOfBoundsException("NIF no encontrado")
        }
        return lista
    }
    catch (index: IndexOutOfBoundsException){
        println("ERROR: ${index.message}")
    }

    limpiarConsola()
    return lista
}

fun mostrarCliente(lista: MutableMap<String, Any>): String? {
    limpiarConsola()
    var serie: String? = ""

    try {
        val nif = preguntarNif()

        if (!lista.containsKey(nif)){
            serie = null
            throw IndexOutOfBoundsException("Cliente no encontrado")

        }
        else {

            for ((i, k) in lista) {
                if (k is Boolean){
                    serie += "${i.uppercase()} - ${k}, "
                }
                else {
                    serie += "${i.uppercase()} - ${k.toString().uppercase()}, "
                }
            }
            return serie
        }
    }
    catch (index: IndexOutOfBoundsException){
        println("ERROR: ${index.message}")
    }
    return serie
}

fun mostrarClientes(lista: MutableMap<String, Any>): String? {
    limpiarConsola()
    var serie: String? = ""

    try {
        val nif = preguntarNif()

        if (!lista.containsKey(nif)){
            serie = null
            throw IndexOutOfBoundsException("Cliente no encontrado")

        }
        else {

            for ((i, k) in lista) {
                if (k is Boolean){
                    serie += "${i.uppercase()} - ${k}, "
                }
                else {
                    serie += "${i.uppercase()} - ${k.toString().uppercase()}, "
                }
            }
            return serie
        }
    }
    catch (index: IndexOutOfBoundsException){
        println("ERROR: ${index.message}")
    }
    return serie
}

fun mostrarClientesPreferentes(lista: MutableMap<String, Any>): String? {
    limpiarConsola()
    var serie: String? = ""

    try {
        val nif = preguntarNif()

        if (!lista.containsKey(nif)){
            serie = null
            throw IndexOutOfBoundsException("Cliente no encontrado")

        }
        else {

            for ((i, k) in lista) {
                if (k is Boolean){
                    serie += "${i.uppercase()} - ${k}, "
                }
                else {
                    serie += "${i.uppercase()} - ${k.toString().uppercase()}, "
                }
            }
            return serie
        }
    }
    catch (index: IndexOutOfBoundsException){
        println("ERROR: ${index.message}")
    }
    return serie
}

fun preguntarPreferente (): Boolean {
    var salir = false
    println("Indique si el cliente es preferente (s/n) »» ")

    try {
        val opcion = readln().lowercase()
        when (opcion) {
            "s" -> {
                salir = true
            }
            "n" -> {
                salir = false
            }
            else -> {
                throw IndexOutOfBoundsException("Seleccione una de las dos opciones")
            }
        }
    }
    catch (index: IndexOutOfBoundsException) {
        println("ERROR: ${index.message}")
    }

    return salir
}

fun preguntarNif(): String {
    println("Introduzca el NIF de su cliente »» ")
    return readln()
}

fun limpiarConsola() {
    repeat(50){
        println("")
    }
}