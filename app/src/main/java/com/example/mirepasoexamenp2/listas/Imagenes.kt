package com.example.mirepasoexamenp2.listas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mirepasoexamenp2.R
import com.example.mirepasoexamenp2.navegacion.ListadoRuta

@Preview(showBackground = true)
@Composable
fun ImagenPreview(){
    val navController = rememberNavController()

}
@Composable
fun ImagenView(navController: NavHostController) {

    var imagenId by remember {
        mutableStateOf(R.drawable.gato)
    }

    Box(modifier = Modifier.fillMaxSize()
        .clickable(){
            navController.navigate(ListadoRuta)
        })
        {

        Image(
            painter = painterResource(id = imagenId),
            contentDescription = "imagen de portada",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Text(
            text = "Un gato",
            color = Color.Yellow,
            fontSize = 40.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .background(Color.Black.copy(alpha = 0.6f))
                .padding(16.dp)
        )

        Column(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(8.dp)
        ) {
            IconButton(
                onClick = {
                    imagenId = if (imagenId == R.drawable.gato) {
                        R.drawable.perro
                    } else {
                        R.drawable.gato
                    }
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Cambiar imagen",
                    tint = Color.Blue
                )
            }

            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "icono estrella",
                tint = Color.Red
            )
        }
    }
}