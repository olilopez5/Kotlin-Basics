package com.example.ejercicioskotlin

//Crea una clase que pueda representar la estructura de una canción.
//La clase Song debe incluir estos elementos de código:

//Propiedades para el título, el artista, el año de publicación y el recuento de reproducciones.
//Propiedad que indica si la canción es popular (si el recuento de reproducciones es inferior a 1,000, considera que es poco popular)
//Un metodo para imprimir la descripción de una canción en este formato:
//"[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".

class Song(val title: String, val artist: String, val year: Int, val playCount: Int) {


    val isPopular: Boolean
        get() = playCount >= 1000


    fun printDescription() {
        println("\"$title\", interpretada por $artist, se lanzó en $year.")
    }
}

fun main() {
    val song1 = Song("Shape of You", "Ed Sheeran", 2017, 5000000)
    val song2 = Song("Old Town Road", "Lil Nas X", 2019, 800)

    song1.printDescription()
    song2.printDescription()

    println("Is \"${song1.title}\" popular? ${song1.isPopular}")
    println("Is \"${song2.title}\" popular? ${song2.isPopular}")
}
