package com.unidad3.conjuntos

fun Ejercicio02_U3_2() {
    val primaria = ingresarNombres("primaria")
    val secundaria = ingresarNombres("secundaria")

    println("\nNombres únicos de alumnos en primaria y secundaria:")
    println(primaria union secundaria)

    val repetidos = primaria intersect secundaria
    println("\nNombres que se repiten entre primaria y secundaria:")
    if (repetidos.isNotEmpty()) {
        println(repetidos)
    } else {
        println("No hay nombres repetidos")
    }

    val soloPrimaria = primaria subtract secundaria
    println("\nNombres de primaria que no están en secundaria:")
    if (soloPrimaria.isNotEmpty()) {
        println(soloPrimaria)
    } else {
        println("Todos los nombres de primaria están en secundaria")
    }

    if (primaria.all { it in secundaria }) {
        println("\nTodos los nombres de primaria están en secundaria")
    } else {
        println("\nNo todos los nombres de primaria están en secundaria")
    }
}
fun ingresarNombres(nivel: String): Set<String> {
    val nombres = mutableSetOf<String>()
    var terminado = false

    println("Ingrese los nombres de los alumnos de $nivel (escriba 'x' para finalizar):")

    while (!terminado) {
        print("Nombre: ")
        val nombre = readLine()?.trim() ?: ""
        if (nombre.lowercase() == "x") {
            terminado = true
        } else {
            nombres.add(nombre)
        }
    }

    return nombres
}
