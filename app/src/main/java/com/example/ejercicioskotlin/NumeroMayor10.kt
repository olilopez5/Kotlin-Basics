package com.example.ejercicioskotlin

//Ejercicio 10: Determinar el mayor de tres números
//Escribe una función que reciba tres números enteros y determine cuál es el mayor de
//los tres utilizando una estructura if/else.
//Requerimiento: La función debe devolver el número mayor o imprimir "Son iguales" si
//los tres números son iguales.

fun numMayor(num1: Int, num2: Int, num3: Int): Int {
    return when {
        num1 == num2 && num2 == num3 -> {
            println("Son iguales")
            num1  // O num2 o num3, ya que son iguales
        }
        num1 >= num2 && num1 >= num3 -> num1
        num2 >= num1 && num2 >= num3 -> num2
        else -> num3
    }
}

fun main() {
    println("Ejercicio 10: Determinar el mayor de tres numeros")
    print("Introduce el primer numero: ")
    val num1 = readln().toInt()
    print("Introduce el segundo numero: ")
    val num2 = readln().toInt()
    print("Introduce el tercer numero: ")
    val num3 = readln().toInt()

    val mayor = numMayor(num1, num2, num3)
    println("El mayor es: $mayor")
}
