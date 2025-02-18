package com.example.ejercicioskotlin

//Ejercicio 3: Múltiplos de 3
//Escribe un programa que imprima todos los números del 1 al 30 que sean múltiplos de
//3. Usa un bucle for.
//Requerimiento: El programa debe imprimir: 3, 6, 9, 12, ..., 30

fun main(){
    println("Ejercicio 3: Multiplos de 3")
    val rango = 1..30
    for (numero in rango) {
        if (numero % 3 == 0) {
            println(numero)
        }
    }
}