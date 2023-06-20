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
fun materias(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        androidx.compose.material3.Text(
            text = "MATERIAS",
            fontSize = 35.sp, fontWeight = FontWeight.Black
        )
        androidx.compose.material3.Text(
            text = "Semestre por semestre")
        androidx.compose.material.Text("(Escolarizado y Sabatino)",


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
                Se1()
                S2()
                S3()
                S4()
                S5()
                S6()
                S7()
                S8()
                S9()




            }
        }
    }
}



@Composable
fun Se1() {
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
                    id = R.drawable.download
                ),
                contentDescription = "se1"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "Semestre 1",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom =5.dp)

                )
                androidx.compose.material.Text("1. Calculo Diferencial")
                androidx.compose.material.Text(
                    "2. Fundamentos de programcaión")
                androidx.compose.material.Text(
                    "3. Taller de Etica")
                androidx.compose.material.Text(
                    "4. Matematicas Discretas")
                androidx.compose.material.Text(
                    "5. Taller de Administracion")
                androidx.compose.material.Text(
                    "6. Fundamentos de investigacion"

                )
            }
        }
    }
}



@Composable
fun S2() {
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
                    id = R.drawable.poo
                ),
                contentDescription = "s2"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "SEMESTRE 2",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                androidx.compose.material.Text("1. Calculo Integral")
                androidx.compose.material.Text(
                    "2. Programacion Orientada a Objetos")
                androidx.compose.material.Text(
                    "3. Contabilidad Financiera")
                androidx.compose.material.Text(
                    "4. Quimica")
                androidx.compose.material.Text(
                    "5. Algebra Lineal")
                androidx.compose.material.Text(
                    "6. Probabilidad y Estadistica"

                )
            }
        }
    }
}

@Composable
fun S3() {
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
                    id = R.drawable.ed
                ),
                contentDescription = "s3"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "SEMESTRE 3",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                androidx.compose.material.Text("1. Calculo Vectorial")
                androidx.compose.material.Text(
                    "2. Estructura de Datos")
                androidx.compose.material.Text(
                    "3. Cultura Empresarial")
                androidx.compose.material.Text(
                    "4. Investigacion de Operaciones")
                androidx.compose.material.Text(
                    "5. Sistemas Operativos")
                androidx.compose.material.Text(
                    "6. Fisica General")
                androidx.compose.material.Text(
                    "7. Desarrollo Sustentable"

                )
            }
        }
    }
}
@Composable
fun S4() {
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
                    id = R.drawable.si
                ),
                contentDescription = "s4"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "SEMESTRE 4",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                androidx.compose.material.Text("1. Ecuaciones Diferenciales")
                androidx.compose.material.Text(
                    "2. Metodos Numericos")
                androidx.compose.material.Text(
                    "3. Topicos Avanzados de programacion")
                androidx.compose.material.Text(
                    "4. Fundamentos de Base de Datos")
                androidx.compose.material.Text(
                    "5. Taller de Sistemas Operativos")
                androidx.compose.material.Text(
                    "6. Principios Electricos y Aplicaciones Digitales")
                androidx.compose.material.Text(
                    "7. Fundamentos de Telecomunicaciones"

                )
            }
        }
    }
}
@Composable
fun S5() {
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
                    id = R.drawable.bd
                ),
                contentDescription = "s5"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "SEMESTRE 5",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                androidx.compose.material.Text("1. Lenguaje y Automatas I")
                androidx.compose.material.Text(
                    "2. Redes de Computadora")
                androidx.compose.material.Text(
                    "3. Taller de Base de Datos")
                androidx.compose.material.Text(
                    "4. Simulacion")
                androidx.compose.material.Text(
                    "5. Fundamentos de Ingenieria de Software")
                androidx.compose.material.Text(
                    "6. Arquitectura de Computadoras")
                androidx.compose.material.Text(
                    "7. Graficacion"

                )
            }
        }
    }
}
@Composable
fun S6() {
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
                    id = R.drawable.abd
                ),
                contentDescription = "s6"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "SEMESTRE 6",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                androidx.compose.material.Text("1. Lenguaje y Automatas II")
                androidx.compose.material.Text(
                    "2. Conmutacion y Enrutamiento de Redes")
                androidx.compose.material.Text(
                    "3. Administracion de Base de Datos")
                androidx.compose.material.Text(
                    "4. Taller de Investigacion I")
                androidx.compose.material.Text(
                    "5. Ingenieria de Software")
                androidx.compose.material.Text(
                    "6. Lenguaje de Interfaz")
                androidx.compose.material.Text(
                    "7. Seguridad en Redes"

                )
            }
        }
    }
}
@Composable
fun S7() {
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
                    id = R.drawable.sp
                ),
                contentDescription = "s7"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "SEMESTRE 7",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                androidx.compose.material.Text("1. Administraccion de Redes")
                androidx.compose.material.Text(
                    "2. Taller de Investigacion II")
                androidx.compose.material.Text(
                    "3. Gestion de Proyectos de Software")
                androidx.compose.material.Text(
                    "4. Sistemas Programables")
                androidx.compose.material.Text(
                    "5. Programacion Web")
                androidx.compose.material.Text(
                    "6. Servicio Social"

                )
            }
        }
    }
}
@Composable
fun S8() {
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
                    id = R.drawable.web
                ),
                contentDescription = "s8"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "SEMESTRE 8",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                androidx.compose.material.Text("1. Programacion Logica y Funcional")
                androidx.compose.material.Text(
                    "2. Inteligencia Artificial"
                )
                androidx.compose.material.Text(
                    "3. Frameworks de Desarrollo Web"
                )
                androidx.compose.material.Text(
                    "4. Software Libre y Herramientas de Computo"
                )
                androidx.compose.material.Text(
                    "5. Programacion Movil"
                )
                androidx.compose.material.Text(
                    "6. Comercio Electronico"

                )
            }
        }
    }
}

@Composable
fun S9() {
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
                    id = R.drawable.tec
                ),
                contentDescription = "s9"
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                androidx.compose.material.Text(
                    "SEMESTRE 9",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                androidx.compose.material.Text(
                    "Materias",
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(bottom = 5.dp)

                )
                androidx.compose.material.Text("1. Especialidad")
                androidx.compose.material.Text(
                    "2. Residencia Profesional"
                )
                androidx.compose.material.Text(
                    "3. Actividades Complementarias"
                )

            }
        }
    }
}
