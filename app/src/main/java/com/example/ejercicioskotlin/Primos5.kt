package com.example.ejercicioskotlin

//Ejercicio 5: Comprobar si un número es primo
//Escribe una función que reciba un número entero y determine si es primo o no. Un
//número es primo si es mayor que 1 y solo es divisible por 1 y por él mismo.
//Requerimiento: Si el número es primo, imprimir Es primo, de lo contrario, imprimir
//No es primo

fun verificarPrimo(n: Int) {
    if (n < 2) {
        println("No es un primo")
        return
    }

    for (i in 2 until n) {
        if (n % i == 0) {
            println("No es primo")
            return
        }
    }

    println("$n , es primo !!!")
}

fun main() {
    print("Introduce un numero: ")
    val n = readln().toInt()
    verificarPrimo(n)
}
