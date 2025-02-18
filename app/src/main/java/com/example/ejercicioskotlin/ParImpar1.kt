package com.example.ejercicioskotlin

/*Ejercicio 1: Par o impar
Escribe un programa que pida un número al usuario y determine si es par o impar. Debe
usar una estructura if/else.
Requerimiento: El programa debe imprimir "El número es par" si el número es divisible
por 2, y "El número es impar" si no lo es.*/

fun main(){
    println("Ejercicio 1: Par o impar")
    println("Di un numero cualquiera :")
    val numero = readln().toInt()
    if( numero %2 == 0){
        println("El numero es par")
    }else
        println("El numero es impar")

}