package com.jovel.practica1_3

fun toFourDigits(numero: Float) : Float {
    val number5digits:Float = String.format("%.4f", numero).toFloat()
    return number5digits
}