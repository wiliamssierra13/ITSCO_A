package com.example.itsco

sealed class items_menu(
    val icon:Int,
    val title:String,
    val ruta: String,
){
    object pantalla1: items_menu(R.drawable.baseline_circle_notifications_24,
    "Inicio", "pantalla1")
    object pantalla2: items_menu(R.drawable.baseline_info_24,
    "Información", "pantalla2")
    object pantalla3: items_menu(R.drawable.baseline_aod_24,
    "Formulario", "pantalla3")
}

