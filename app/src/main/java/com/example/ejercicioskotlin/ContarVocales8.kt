package com.example.ejercicioskotlin

//Ejercicio 8: Contar vocales en una cadena
//Escribe una función que reciba una cadena de texto y cuente cuántas vocales (a, e, i, o,
//u) contiene. La función debe devolver el número de vocales encontradas.
//Requerimiento: El programa debe ser sensible a mayúsculas y minúsculas

fun contarVocales(cadena: String): Int {

    val vocales = "aeiouAEIOU"
    var contador = 0

    for (caracter in cadena) {

        if (caracter in vocales) {
            contador++
        }
    }

    return contador
}

fun main() {
    println("Ejercicio 8: Contar vocales")
    print("Introduce un texto: ")
    val texto = readln()
    val resultado = contarVocales(texto)

    println("La cadena contiene $resultado vocales.")
}
