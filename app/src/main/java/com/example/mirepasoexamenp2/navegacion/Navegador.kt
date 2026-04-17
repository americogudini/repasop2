package com.example.mirepasoexamenp2.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mirepasoexamenp2.listas.AnimalListScreen
import com.example.mirepasoexamenp2.listas.ImagenView
import kotlinx.serialization.Serializable

@Serializable
object BienvenidoRuta

@Serializable
object ListadoRuta

@Preview(showBackground = true)
@Composable
fun NavegacionView() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = BienvenidoRuta
    ) {
        composable<BienvenidoRuta> {
            ImagenView(navController)
        }



        composable<ListadoRuta> {
            AnimalListScreen(navController)
        }
    }
}