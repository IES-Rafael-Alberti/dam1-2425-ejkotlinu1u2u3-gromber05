package com.unidad3.diccionarios

fun Ejercicio11_U3_1() {
    val directorio = """
        nif;nombre;email;teléfono;descuento
        01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5
        71476342J;Macarena Ramírez;macarena@mail.com;692839321;8
        63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2
        98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7
    """.trimIndent()

    val clientes = separarDirectorio(directorio)

    for ((nif, cliente) in clientes) {
        println("$nif - $cliente")
    }

}


fun separarDirectorio(directorio: String): Map<String, Map<String, Any>> {
    val lineas = directorio.split("\n")
    val campos = lineas[0].split(';')

    val clientes = mutableMapOf<String, Map<String, Any>>()

    for (linea in lineas.drop(1)) {
        val (nif, cliente) = crearCliente(linea, campos)
        clientes[nif] = cliente
    }

    return clientes
}

fun crearCliente(linea: String, campos: List<String>): Pair<String, Map<String, Any>> {
    val datosCliente = procesarDatos(linea, campos)
    val nif = datosCliente["nif"] as String
    return Pair(nif, datosCliente)
}

fun procesarDatos(linea: String, campos: List<String>): Map<String, Any> {
    val datos = linea.split(';')

    val cliente = mutableMapOf<String, Any>()
    cliente["nif"] = datos[0]
    cliente[campos[1]] = datos[1]
    cliente[campos[2]] = datos[2]
    cliente[campos[3]] = datos[3]
    cliente[campos[4]] = datos[4].toFloat()
    return cliente
}


