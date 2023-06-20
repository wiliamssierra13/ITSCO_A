package com.example.itsco.ui.theme.mapas

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.maps.android.compose.CameraPositionState
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MarkerInfoWindowContent
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.compose.rememberMarkerState

val ISC = com.google.android.gms.maps.model.LatLng(18.3521850, -95.8104067)


@Composable
fun Mapas(){
    val veracruz = com.google.android.gms.maps.model.LatLng(18.3521850, -95.8104067)
    val defaulCamaraPosition = CameraPosition.fromLatLngZoom(veracruz, 15f)
    val cameraPositionState = rememberCameraPositionState{
        position = defaulCamaraPosition
    }
    var isMapLoaded by remember { mutableStateOf(false) }
    Box(modifier = Modifier
        .size(500.dp,500.dp)
        .padding(15.dp, vertical = (75.dp))

    ){

        GoogleMapview (
            modifier = Modifier.matchParentSize(),
            cameraPositionState = cameraPositionState,
            onMapLoaded = {
                isMapLoaded = true
            }
        )
        if (!isMapLoaded){
            AnimatedVisibility (
                modifier = Modifier
                    .matchParentSize(),
                visible = !isMapLoaded,
                enter = EnterTransition.None,
                exit = fadeOut()
                    ){
                CircularProgressIndicator(
                    modifier = Modifier
                        .background(MaterialTheme.colors.background)
                        .wrapContentSize()
                )
            }
        }
    }
}

@Composable
fun GoogleMapview(
    modifier: Modifier = Modifier,
    cameraPositionState: CameraPositionState = rememberCameraPositionState(),
    onMapLoaded:() ->Unit = {},
    content: @Composable () -> Unit ={}


    ){
    val ISCState = rememberMarkerState(position = ISC)
    GoogleMap(
        modifier =Modifier,
        cameraPositionState = cameraPositionState,
        onMapLoaded = onMapLoaded
    ){
        MarkerInfoWindowContent(
            state = ISCState,
            icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)
        ){
            Text(text = "ING. Sistemas Computacionales")
        }
        content()
    }

}