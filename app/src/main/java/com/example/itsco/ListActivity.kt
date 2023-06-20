package com.example.itsco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.itsco.ui.theme.ITSCOTheme

class ListActivity : ComponentActivity(){
val Listado : List<Articulo> = listOf(
    Articulo(R.drawable.ic_launcher628_background, "Proyectos", " Proyectos realizados durante la carrera")

    )
    override fun onCreate(savedInstanceStte: Bundle?){
        super.onCreate(savedInstanceStte)
        setContent{
            ITSCOTheme( true){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    pantalla (Listado)

                }

            }

        }
    }
}
@Composable
fun ListItemRow(item : Articulo) {
    var masInformacion  by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = MaterialTheme.shapes.small)
            .background(color = MaterialTheme.colors.secondary)
            .padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(
                    id = item.image
                ), contentDescription = item.details
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                text = item.title,

                style = MaterialTheme.typography.h6
            )

            IconButton(onClick = {
                masInformacion = !masInformacion
            }) {
                Icon(
                    Icons.Filled.ArrowDropDown,
                    "Icono expandir o colapsar",
                    Modifier.rotate(
                        if (masInformacion) 180f else 360f

                    )
                )


            }

        }


    }
}

@Composable
fun pantalla(Listado: List< Articulo>) {

    LazyColumn() {
        items(Listado) { item ->
            ListItemRow(item)

        }
    }
}
