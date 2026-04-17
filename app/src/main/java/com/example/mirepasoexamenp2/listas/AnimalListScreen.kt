package com.example.mirepasoexamenp2.listas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@SuppressLint("ViewModelConstructorInComposable")
//@Preview(showBackground = true)
@Composable
fun AnimalListScreen(navController: NavHostController) {
    val animalesViewModel = AnimalViewModel()
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item{
            Row() {
                Text("Mis Animales")
                Button(onClick ={
navController.popBackStack()
                } ) {
Text("Regresar")
                }
            }
        }
    items( animalesViewModel.animales  ){
        AnimalView(it, navController)
    }
item{
    Text("Desarrollado por americo")
}
    }
}