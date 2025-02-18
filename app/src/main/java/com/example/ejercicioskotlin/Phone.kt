package com.example.ejercicioskotlin

//En el código inicial que se proporciona en el siguiente fragmento de código,
//escribe una clase FoldablePhone que se herede de la clase Phone. Debe contener lo siguiente:
//Una propiedad que indica si el teléfono está bloqueado
//Un comportamiento de función switchOn()diferente de la clase Phone para que solo
//encienda la pantalla cuando el teléfono no esté bloqueado
//Métodos para cambiar el estado de plegado

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}