package com.example.itsco

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.itsco.items_menu.pantalla1
import com.example.itsco.items_menu.pantalla2
import com.example.itsco.items_menu.pantalla3
import com.example.itsco.ui.theme.instalaciones
import com.example.itsco.ui.theme.maestros
import com.example.itsco.ui.theme.materias


@ExperimentalMaterial3Api
@Composable
fun NavigationHost(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = pantalla1.ruta
        ){
        composable(pantalla1.ruta){
            Inicio()
        }
        composable(pantalla2.ruta){
            Información(navController=navController)
        }
        composable(pantalla3.ruta) {
            Formulario()
        }
        composable("P_proyectos"){
            proyectos(navController=navController)
        }
        composable("instalaciones"){
            instalaciones(navController=navController)
        }
        composable("maestros"){
            maestros(navController = navController)
        }
        composable("materias"){
            materias(navController = navController)
        }


    }
}

@Composable
fun NavigationHosts(){
    val navController= rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Destination.P_pantalla .route
    ) {
        composable(Destination.P_pantalla.route){
            proyectos(navController=navController)
        }
    }
}


