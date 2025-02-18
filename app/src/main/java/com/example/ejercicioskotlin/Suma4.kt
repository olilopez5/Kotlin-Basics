package com.example.ejercicioskotlin


//Ejercicio 4: Calcular la suma de los números
//Escribe una función que reciba un número entero n y calcule la suma de todos los
//números desde 1 hasta n usando un bucle for.
//Requerimiento: La función debe devolver la suma. Por ejemplo, si n = 5, el resultado
//será 1 + 2 + 3 + 4 + 5 = 15

fun sumaNum(n: Int): Int {
    var suma = 0
    for (i in 1..n) {
        suma += i
        if (i < n) {
            print("$i + ")
        } else {
            print("$i = ")
        }
    }
    return suma
}

fun main() {
    println("Introduce un entero: ")
    val n = readln().toInt()
    val resultado = sumaNum(n)
    println("$resultado")
}

