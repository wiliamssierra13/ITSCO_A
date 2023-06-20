package com.example.itsco

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.SnackbarDuration
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.itsco.items_menu.*
import com.example.itsco.ui.theme.ITSCOTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ITSCOTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   PantallaPrincipal()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun PantallaPrincipal() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val navigation_item = listOf(
        pantalla1,
        pantalla2,
        pantalla3
    )

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {NavegacionInferior(navController,navigation_item)},
        floatingActionButton = {Fab(scope, scaffoldState)},
        isFloatingActionButtonDocked = true
    ){
        NavigationHost(navController)
    }
}

@Composable
fun currentRoute(navController: NavHostController): String?{
    val entrada by navController.currentBackStackEntryAsState()
    return entrada?.destination?.route
}

@Composable
fun NavegacionInferior(
    navController: NavHostController,
    menu_items: List<items_menu>) {
    BottomAppBar(
        cutoutShape = MaterialTheme.shapes.small.copy(
            CornerSize(percent = 50)
        ),
        backgroundColor = Color.LightGray

    ) {
        BottomNavigation(
            modifier = Modifier.padding(
                0.dp,0.dp,60.dp,0.dp
            ),
            backgroundColor = Color.LightGray
        ) {
            val currentRoute = currentRoute(navController = navController)
            menu_items.forEach { item ->
                BottomNavigationItem(
                    selected = currentRoute == item.ruta,
                    onClick = {navController.navigate(item.ruta)},
                    icon = {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = item.title,
                            tint = MaterialTheme.colors.error)
                    },
                    label = {Text(item.title)},
                    alwaysShowLabel = false
                )
            }
        }
    }
}

@Composable
fun Fab(scope: CoroutineScope, scaffoldState: ScaffoldState) {
    FloatingActionButton(
        onClick = {
            scope.launch { scaffoldState.snackbarHostState
                .showSnackbar("Esta opción estará disponible proximamente",
                    "Aceptar",duration= SnackbarDuration.Indefinite
                )
            }
        },
        backgroundColor = MaterialTheme.colors.error
    ){
        Icon(imageVector = Icons.Filled.List,
            contentDescription = "Lista"

        )

    }
}

