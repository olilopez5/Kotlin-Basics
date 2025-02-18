package com.example.ejercicioskotlin

class FoldablePhone(
    isScreenLightOn: Boolean = false,
    var isLocked: Boolean = false,  // Propiedad para saber si el teléfono está bloqueado
    var isFolded: Boolean = true    // Propiedad para saber si el teléfono está plegado
) : Phone(isScreenLightOn) {

    // Comportamiento de switchOn(), solo enciende la pantalla si no está bloqueado
    override fun switchOn() {
        if (!isLocked) {
            super.switchOn()
        } else {
            println("The phone is locked. Can't turn on the screen.")
        }
    }

    // Métodos para cambiar el estado de plegado
    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

fun main() {
    val myPhone = FoldablePhone()

    myPhone.switchOn() // No enciende la pantalla porque está bloqueado
    myPhone.checkPhoneScreenLight()

    myPhone.isLocked = false // Desbloqueamos el teléfono
    myPhone.switchOn() // Enciende la pantalla
    myPhone.checkPhoneScreenLight()

    myPhone.fold() // Plega el teléfono
    myPhone.unfold() // Desplega el teléfono
}