
package com.example.itsco


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowLeft
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.itsco.ui.theme.mapas.Mapas
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue


@Composable
fun Inicio(){
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()

    ){
        CarouselCard()
        Mapas()

    }

}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCard() {
    val pagerState = com.google.accompanist.pager.rememberPagerState(initialPage = 2)
    val sliderList = listOf(
        "https://i.ibb.co/pQmgdb0/Imagen-9.jpg",
        "https://i.ibb.co/0qbcq7h/Imagen-1.jpg",
        "https://i.ibb.co/MNZtfpk/claro.jpg",
        "https://i.ibb.co/W21WHcT/Imagen-3.jpg",
        "https://i.ibb.co/Gt79k2Z/Imagen-6.jpg",
        "https://i.ibb.co/MD5vwvd/Imagen-7.jpg"

    )
    val scope = rememberCoroutineScope()
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        androidx.compose.material3.Text(
            text = "Bienvenido a ISC ",
            fontSize = 35.sp, fontWeight = FontWeight.Black

        )

        androidx.compose.material3.Text(
            text = "''Cree en ti mismo y en lo que eres'' ",
            fontSize = 17.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                enabled = pagerState.currentPage > 0,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(pagerState.currentPage - 1)
                    }
                }) {
                Icon(Icons.Default.ArrowLeft, null)
            }

            com.google.accompanist.pager.HorizontalPager(
                count = sliderList.size,
                state = pagerState,
                contentPadding = PaddingValues(horizontal = 65.dp),
                modifier = Modifier
                    .height(300.dp)
                    .weight(1f)
            ) { page ->
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .graphicsLayer {
                            val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                            androidx.compose.ui.util.lerp(
                                start = 0.85f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            )
                                .also { scale ->
                                    scaleX = scale
                                    scaleY = scale
                                }
                            alpha = androidx.compose.ui.util.lerp(
                                start = 0.5f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            )
                        }
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(sliderList[page])
                            .crossfade(true)
                            .scale(coil.size.Scale.FILL)
                            .build(),
                        contentDescription = null,
                        placeholder = painterResource(id = R.drawable.placeholder),
                        error = painterResource(id = R.drawable.no_encontrado)
                    )
                }
            }
            IconButton(
                enabled = pagerState.currentPage < pagerState.pageCount - 1,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
                    }
                }) {
                Icon(Icons.Default.ArrowRight, null)
            }
        }
        Row(
            Modifier
                .height(50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(sliderList.size) {
                val color =
                    if (pagerState.currentPage == it) Color.DarkGray else Color.LightGray
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(CircleShape)
                        .size(10.dp)
                        .background(color)
                        .clickable {
                            scope.launch {
                                pagerState.animateScrollToPage(it)
                            }
                        }
                ) {

                }


            }
        }
        Column(
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            androidx.compose.material3.Text(
                text = "Nuestra Historia" ,
                fontSize = 35.sp, fontWeight = FontWeight.Black
            )
            androidx.compose.material3.Text(
                text = "Conoce un poco sobre nosotros:",
                fontSize = 17.sp
            )
            Spacer(modifier = Modifier.height(10.dp))
            androidx.compose.material3.Text(
                text ="La primera convocatoria para los Jóvenes que aspiraran cursar sus estudios en el Instituto Tecnológico Superior de Cosamaloapan se publicó en el diario el Dictamen con fecha de 8 de Agosto de 1997. Se comunica la convocatoria por medio de las estaciones de radio XEQO y XEFU a partir del sábado 9 de Agosto, el domingo 10 de Agosto se asistió al Programa Libre Expresión de la Estación de radio para comentar el contenido de la Convocatoria. El 11 de Agosto de 1997 se inicia el proceso de expedición de fichas para el examen de admisión. Se recibieron 213 solicitudes de nuevo ingreso, de los cuales se inscriben 193 alumnos, 100 en Informática y 93 en Ingeniería Industrial." ,
                fontSize = 14.sp,
                style= MaterialTheme.typography.labelSmall
            )
        }
    }
}

