package com.example.mirepasoexamenp2.listas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun AnimalPreview() {
    val animal = AnimalModelo(id = 1, tipo = "Jaguar", imagen = R.drawable.jaguar, nombre = "Leo", edad = 23)
    AnimalView(animal, rememberNavController())
}

@Composable
fun AnimalView(animal: AnimalModelo, navegador: NavHostController) {

    /*var tipo: String = "Delfin"
    var imagen: Int = R.drawable.dolphin
    var nombre: String = "Kiki"
    var edad: Int = 10 */

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        Row(modifier = Modifier.padding(8.dp)) {

            Image(
                modifier = Modifier.height(100.dp),
                painter = painterResource(animal.imagen),
                contentDescription = "imagen del animal",
                contentScale = ContentScale.FillHeight
            )

            Column(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Text("Tipo: ${animal.tipo}", fontSize = 19.sp)
                Text("Nombre: ${animal.nombre} ", color = Color.Blue, fontSize = 19.sp)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text("EDAD: ${animal.edad} Años")

                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.CenterEnd
                    ) {
                        Button(onClick = {
                            navegador.navigate(ListadoRuta)
                        }) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Ver")
                                Spacer(modifier = Modifier.width(8.dp))
                                Icon(
                                    imageVector = Icons.Filled.Search,
                                    contentDescription = "ver más"
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}