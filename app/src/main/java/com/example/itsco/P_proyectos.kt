package com.example.itsco

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun proyectos(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        androidx.compose.material3.Text(
            text = "Proyectos",
            fontSize = 35.sp, fontWeight = FontWeight.Black
        )
        androidx.compose.material3.Text(
            text = "realizados por los alumnos",
            fontSize = 17.sp, fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.padding(20.dp))
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(bottom = 60.dp)
            ) {
                SME()
                AS()
                CDL()
                SDA()
                BA()
                CRA()
                TRI()
                BRA()


            }
        }
    }



@Composable
fun SME() {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {


        Column() {
            Image(
                painter = painterResource(
                    id = R.drawable.nuestro
                ),
                contentDescription = "SME"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "S.M.E",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "SISTEMA DE MANTENIMIENTO DE ESTANQUES",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Sistema que nos permite monitorear y llevar acabo el " +
                            "control de diversos aspectos a regular mediante un " +
                            "sistema, para mejorar el sitema de estanque.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}



@Composable
fun AS() {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {

        Column() {
            Image(
                painter = painterResource(
                    id = R.drawable.christian
                ),
                contentDescription = "AS"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "A.S.",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "ALERT SECURITY",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Sistema de deteccion de movimiento con sonnido" +
                            "para la mayor seguridad en nuestra" +
                            "casa o demas lugares.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}

@Composable
fun CDL() {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {

        Column() {
            Image(
                painter = painterResource(
                    id = R.drawable.jan
                ),
                contentDescription = "CDL"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "C.D.L.",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "CONTROL DE LUCES",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Sistema de deteccion de movimmientos para el " +
                            "encendido y apagado de las luces del salon" +
                            "ayudando asi a un menor consumo de energia.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}
@Composable
fun SDA() {
     Card(
            modifier = Modifier
                .padding(8.dp)
                .clickable { }
                .fillMaxWidth(),
            elevation = 8.dp,
            shape = RoundedCornerShape(8.dp)
        ) {

            Column() {
                Image(
                    painter = painterResource(
                        id = R.drawable.monse
                    ),
                    contentDescription = "SDA"
                )
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Text(
                        "S.D.A",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(bottom = 15.dp)
                    )
                    Text(
                        "SISTEMA DE ACCESO",
                        style = MaterialTheme.typography.labelSmall,
                        modifier = Modifier.padding(bottom = 3.dp)

                    )
                    Text(
                        "Sistema para el control de entrada y salida mendiante" +
                                "un codigo para tener un control de la misma .",
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                }
            }
        }
    }

@Composable
fun BA() {
    Card(modifier = Modifier
        .padding(8.dp)
        .clickable { }
        .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {


        Column() {
            Image(
                painter = painterResource(
                    id = R.drawable.ana
                ),
                contentDescription = "BA"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "B.A",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "BASURERO  AUTOMATIZADO",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Basurero automatizado con el detector " +
                            "de movimiento para su mayor facilidad " +
                            "del levantamiento de su tapa.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}

 @Composable
 fun CRA() {
     Card(modifier = Modifier
         .padding(8.dp)
         .clickable { }
         .fillMaxWidth(),
         elevation = 8.dp,
         shape = RoundedCornerShape(8.dp)
     ) {


         Column() {
             Image(
                 painter = painterResource(
                     id = R.drawable.carrito
                 ),
                 contentDescription = "CRA"
             )
             Column(
                 modifier = Modifier
                     .padding(16.dp)
             ) {
                 Text(
                     "C.R.A",
                     style = MaterialTheme.typography.titleLarge,
                     modifier = Modifier.padding(bottom = 15.dp)
                 )
                 Text(
                     "CARRO ROBOT AUTONOMO",
                     style = MaterialTheme.typography.labelSmall,
                     modifier = Modifier.padding(bottom = 3.dp)

                 )
                 Text(
                     "Se presenta  un vehiculo terrestre para hacer" +
                             "recorridos sitematicos de manera autonoma," +
                             "con un algoritmo de navegacion baasado en la informacion" +
                             "compas electronico y un codificador optico.",
                     style = MaterialTheme.typography.titleMedium,
                     modifier = Modifier.padding(bottom = 5.dp)
                 )
             }
         }
     }
 }
@Composable
fun TRI() {
    Card(modifier = Modifier
        .padding(8.dp)
        .clickable { }
        .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {


        Column() {
            Image(
                painter = painterResource(
                    id = R.drawable.robot
                ),
                contentDescription = "TRI"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "T.R.I.",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "TANQUE ROBOT INTELIGENTE",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Robot programable inteligente con evitacion" +
                            "de obstaculos ultrasónica , seguimiento" +
                            "STEM, Control de direccion del veiculo " +
                            "inalambrico con luz RGB.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}
@Composable
fun BRA() {
    Card(modifier = Modifier
        .padding(8.dp)
        .clickable { }
        .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {


        Column() {
            Image(
                painter = painterResource(
                    id = R.drawable.garra
                ),
                contentDescription = "BRA"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "B.R.A",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "BRAZO ROBOT ACRILICO",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Se utilizan principalmente para simular o amplificar " +
                            "la capacidad del brazo humano durante un proceso de trabajo." +
                            " Están especialmente indicados para automatizar procesos de " +
                            "trabajo mecánicos y repetitivos. Pueden trabajar de manera independiente" +
                            " o pueden formar parte de un equipo en una línea de montaje," +
                            " ya sea con humanos o con otros robots.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}


