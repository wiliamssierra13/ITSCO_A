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
fun maestros(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        androidx.compose.material3.Text(
            text = "DOCENTES",
            fontSize = 35.sp, fontWeight = FontWeight.Black
        )
        androidx.compose.material3.Text(
            text = "un poco de su labor",
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
                paco()
                robert()
                fede()
                glenis()




            }
        }
    }
}



@Composable
fun paco() {
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
                    id = R.drawable.nodesbloqueado
                ),
                contentDescription = "paco"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "Francisco javier",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    "Reyes Santamand",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom =5.dp)

                )
                Text(
                    "Docente enfocado en materias  como " +
                            "programacion movil," +
                            "programacion logica  y funcional, " +
                            "graficacion, etc, le gusta mucho  el cafe.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}



@Composable
fun robert() {
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
                    id = R.drawable.nodesbloqueado
                ),
                contentDescription = "robert"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "Roberto",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    "Zamudio Portilla",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                Text(
                    "Docente enfocado en materias como " +
                            "programacion web, base de datos," +
                            "etc, experto en dar conferencias sobre " +
                            "sobre diversos temas.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}

@Composable
fun fede() {
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
                    id = R.drawable.nodesbloqueado
                ),
                contentDescription = "fede"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "Federico",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    "Martinez Galán",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                Text(
                    "Docente enfocado en redes," +
                            "asigna a sus alumnos  practicas " +
                            "relacionadas a la materia para " +
                            "contribuir a una mejor " +
                            "formacion profecional.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}
@Composable
fun glenis() {
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
                    id = R.drawable.nodesbloqueado
                ),
                contentDescription = "glenis"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    "Glenis Elbania",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    "Molina Jauregui",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                Text(
                    "Docente enfocado en materias " +
                            "como comercio electronio," +
                            "siempre brinda buenas ideas de proyectos " +
                            "gracias a su gran creatividad.",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }
    }
}
