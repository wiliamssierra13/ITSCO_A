package com.example.itsco

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Formulario(){
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()

    ){
        openEmailer()

    }

}
data class FormData(
    val nombre: String,
    val apellido: String,
    val localidad: String,
    val estado: String,
    val escuela: String,
    val promedio: String,
    val que_te_atré: String,
    val que_te_motivio: String,
    val edad: String,

    val telefono: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun openEmailer() {
    var formData by remember { mutableStateOf(FormData("", "","","","","","","","","",))}

    // in the below line, we are
    // creating variables for URL
    val senderEmail = remember {
        mutableStateOf("wiliamsiserra6@gmail.com")
    }
    val emailSubject = remember {

        mutableStateOf("POSTULANTE")
    }



    // on below line we are creating
    // a variable for a context
    val ctx = LocalContext.current

    // on below line we are creating a column
    Column(

        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        androidx.compose.material3.Text(
            text = "Postulate",
            fontSize = 35.sp, fontWeight = FontWeight.Medium,
            color = Color.Black    )


        Spacer(modifier = Modifier.height(16.dp))


        TextField(
            value = formData.nombre,
            onValueChange = { formData = formData.copy(nombre = it) },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = formData.apellido,
            onValueChange = { formData = formData.copy(apellido = it) },
            label = { Text("Apellidos") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))


        TextField(
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            value = formData.edad.toString(),
            onValueChange = { formData = formData.copy(edad = it) },
            label = { Text("Edad") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            value = formData.telefono,
            onValueChange = { formData = formData.copy(telefono = it) },
            label = { Text("Numero telefonico") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))




        TextField(
            value = formData.localidad,
            onValueChange = { formData = formData.copy(localidad = it) },
            label = { Text("¿Localidad o Municipio del que provienes?") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = formData.estado,
            onValueChange = { formData = formData.copy(estado = it) },
            label = { Text("Estado") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = formData.escuela.toString(),
            onValueChange = { formData = formData.copy(escuela = it) },
            label = { Text("¿Escuela  en la que estudias?") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            value = formData.promedio.toString(),
            onValueChange = { formData = formData.copy(promedio = it) },
            label = { Text("¿Promedio que llevas?") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = formData.que_te_atré,
            onValueChange = { formData = formData.copy(que_te_atré = it) },
            label = { Text("¿Que es lo que te atrae  de la carrera de" +
                    " ING. En Sistemas Computacionales") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = formData.que_te_motivio,
            onValueChange = { formData = formData.copy(que_te_motivio = it) },
            label = { Text("¿Que te motivio a elegir la carrera " ) },
            modifier = Modifier.fillMaxWidth()
        )


        Spacer(modifier = Modifier.height(30.dp))

        // on below line adding a
        // button to send an email
        Button(onClick = {


            // on below line we are creating
            // an intent to send an email
            val i = Intent(Intent.ACTION_SEND)

            // on below line we are passing email address,
            // email subject and email body
            val emailbody="Nombre del postulante:"+formData.nombre + " "+ formData.apellido+ "\nEdad:"+formData.edad+
                    "\nNumero telefonico:"+formData.telefono+"\nLocalidad o municipio:"+formData.localidad+","+formData.estado+
                    "\nEscuela de procedencia:"+formData.escuela+"\nPromedio:"+formData.promedio+"\nQue te atrae:"+formData.que_te_atré+
                    "\nQue te motivo:"+formData.que_te_motivio
            val emailAddress = arrayOf(senderEmail.value)
            i.putExtra(Intent.EXTRA_EMAIL,emailAddress)
            i.putExtra(Intent.EXTRA_SUBJECT,emailSubject.value)
            i.putExtra(Intent.EXTRA_TEXT,emailbody)


            // on below line we are
            // setting type of intent
            i.setType("message/rfc822")

            // on the below line we are starting our activity to open email application.
            ctx.startActivity(Intent.createChooser(i,"Choose an Email client : "))

        })

        {
            // on the below line creating a text for our button.
            Text(
                // on below line adding a text ,
                // padding, color and font size.
                text = "Enviar correo",
                modifier = Modifier
                    .padding(10.dp),
                color = Color.Red,
                fontSize = 15.sp

            )

        }
    }
    Spacer(modifier = Modifier
        .height(80.dp)
        .width(50.dp)
    )
}
