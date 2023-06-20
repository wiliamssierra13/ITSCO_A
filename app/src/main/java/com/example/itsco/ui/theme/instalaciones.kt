package com.example.itsco.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
import com.example.itsco.R

@Composable
fun instalaciones(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        androidx.compose.material3.Text(
            text = "INSTACIONES",
            fontSize = 35.sp, fontWeight = FontWeight.Black
        )
        androidx.compose.material3.Text(
            text = "QUE  TIENE EL TECNOLOGICO",
            fontSize = 17.sp
        )

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
                CC()
                LR()
                SC()
                S20()
                S19()
                S1()



            }
        }
    }
}



@Composable
fun CC() {
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
                    id = R.drawable.centro_computo
                ),
                contentDescription = "CC"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "Edificio C",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "Centro de Computo",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Es el area destinada a ingenieria" +
                            "en sistemas computacionales " +
                            "dentro del instituto tecnologico" +
                            "superior de cosamaloapan, en el" +
                            "sucede toda la  magia.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}



@Composable
fun LR() {
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
                    id = R.drawable.redes
                ),
                contentDescription = "LR"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "Redes",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "Laboratorio de Redes",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Proporciona lo necesario pra brindar " +
                            "unn aprendizaje agradable a " +
                            "los  estudiantes mediante" +
                            "prácticas y diversas actividades" +
                            "enfocadas en redes.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}

@Composable
fun SC() {
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
                    id = R.drawable.computo
                ),
                contentDescription = "SC"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "S.C.",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "Salon de Computo",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Proporciona equipos para facilitar el" +
                            "aprendizaje enfocado a las materias" +
                            "impartidas en esta aula como puede" +
                            "ser programacion orientada a objetos," +
                            "programacion web, etc.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}
@Composable
fun S20() {
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
                    id = R.drawable.salon_clases
                ),
                contentDescription = "S20"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "Salon 20",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Proporciona comodidad para poder desarrollar diversas actividades " +
                            "dentro  de ella, se puede utilizar para impartir " +
                            "clases un poco mas complejas que no requieren el  " +
                            "uso de equipos en especifico.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}

@Composable
fun S19() {
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
                    id = R.drawable.salaon19
                ),
                contentDescription = "S19"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "Salon 19",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Cuenta con lo necesario para brindar " +
                            "comodidad al estudiante, muy " +
                            "recomendado para exposiciones.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}

@Composable
fun S1() {
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
                    id = R.drawable.lc1
                ),
                contentDescription = "S1"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "LC1",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    "Salon LC1",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(bottom = 3.dp)

                )
                Text(
                    "Cuenta  con equipos que nos proporcionan" +
                            "un recurso mas para el aprendizaje," +
                            "es un salon amplio apto para " +
                            "actividades multiples.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}
