package com.example.itsco

sealed class Destination(
    val route: String
){

    object P_pantalla:Destination("P_pantalla")

}
