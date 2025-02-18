package com.example.ejercicioskotlin

//Por lo general, en una subasta, el ofertante que ofrece la importación más alto
//determina el precio de un artículo. En esta subasta especial, si nadie ofrece por un artículo,
//este se vende automáticamente a la casa de subastas al precio mínimo.
//
//En el código inicial que se proporciona en el siguiente fragmento de código,
//se te proporciona una función auctionPrice()que acepta un tipo Bid?anulable como argumento:

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {

    return bid?.amount ?: minimumPrice

    //Si bid no es nulo, se toma el valor de bid.amount; si es nulo, se usa minimumPrice.
    //Esto garantiza que si alguien ha hecho una oferta, se utilice esa cantidad como precio final.
    // Si no hay oferta, se usa el precio mínimo.
}