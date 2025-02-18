package com.example.ejercicioskotlin

fun tablaMult(numero: Int) {
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}") //interpolación de cadenas
    }
}

fun main() {
    println("Ejercicio 9: Imprimir la tabla de multiplicar")
    print("Introduce el numero para la tabla de multiplicar: ")
    val numero = readln().toInt()
    tablaMult(numero)
}
