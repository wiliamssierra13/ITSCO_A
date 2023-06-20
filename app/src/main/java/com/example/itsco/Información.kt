package com.example.itsco

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Información(navController:NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(bottom = 60.dp)
        ) {
            Cardproyectos(navController = navController)
            Cardintalciones(navController=navController)
            Cardmaestros(navController=navController)
            Cardmaterias(navController=navController)
        }
    }
}



@Composable
fun Cardproyectos(navController: NavHostController) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ){
        Column(){
            Image(
                painter = painterResource(
                    id = R.drawable.sistemas
                ),
                contentDescription = "Proyectos de la carrera"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text( "Proyectos",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 8.dp)  )

                Text("Proyectos realizados por los alumnos en el " +
                        "transcurso de su carrera",
                    style= MaterialTheme.typography.titleMedium)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Box(){
                        Row(
                            modifier = Modifier.clickable {

                            }
                        ){
                            Spacer(modifier = Modifier.width(220.dp))
                            TextButton(
                                onClick = {
                                    navController.navigate("P_proyectos")
                                }) {
                                Text("ver mas....")
                            }

                        }
                    }
                    
                        }
                    }
                }
            }
        }
    
@Composable
fun Cardintalciones(navController: NavHostController){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ){
        Column(){
            Image(
                painter = painterResource(
                    id = R.drawable.centro_computo
                ),
                contentDescription = "instalaciones"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text( "Intalaciones del centro de computo",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 8.dp)  )

                Text("salones donde se tomaran las  clases " +
                        "en el transcurso de la carrera",
                    style= MaterialTheme.typography.titleMedium)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Box(){
                        Row(){
                            Spacer(modifier = Modifier.width(220.dp))
                            TextButton(
                                onClick = {
                                    navController.navigate("instalaciones")
                                }) {
                                Text("ver mas....")
                            }

                        }
                    }
                    
                }
            }
        }
    }
}
@Composable
fun Cardmaestros(navController: NavHostController){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ){
        Column(){
            Image(
                painter = painterResource(
                    id = R.drawable.nodesbloqueado
                ),
                contentDescription = "Maestros"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text( "Maestros",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 8.dp)  )

                Text("Maestros que nos imparten las materias " +
                        "fundamentales de la carrera",
                    style= MaterialTheme.typography.titleMedium)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Box(){
                        Row(){
                            Spacer(modifier = Modifier.width(220.dp))
                            TextButton(
                                onClick = {
                                    navController.navigate("maestros")
                                }) {
                                Text("Var mas.....")
                            }

                        }
                    }
                    
                }
            }
        }
    }
}
@Composable
fun Cardmaterias(navController: NavHostController){
    Card(
        modifier = Modifier

            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ){
        Column(){
            Image(
                painter = painterResource(
                    id = R.drawable.sp
                ),
                contentDescription = "Materias"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text( "Materias ",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 10.dp)  )

                Text("Aqui veras las materias que tomaras a lo largo de la carrera",
                    style= MaterialTheme.typography.titleMedium)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Box(){
                        
                        Row(){
                            Spacer(modifier = Modifier.width(220.dp))
                            TextButton(
                                onClick = {
                                navController.navigate("materias")
                            }) {
                                Text("Ver mas.....")
                            }

                        }
                    }
                   
                    }

                }
            }
        }
    }

