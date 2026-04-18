package com.example.mirepasoexamenp2.listas

import androidx.lifecycle.ViewModel
import com.example.mirepasoexamenp2.R

class AnimalViewModel: ViewModel() {
    private val _animales = mutableListOf<AnimalModelo>()
    var animales: List<AnimalModelo> = _animales

    init {
        _animales.add(AnimalModelo(1, "Trueno Temblor", R.drawable.trueno01))
        _animales.add(AnimalModelo(2, "Cortaleña", R.drawable.cortalena01))
        _animales.add(AnimalModelo(3, "Caldero", R.drawable.caldero01))
        _animales.add(AnimalModelo(4, "Metamórfara", R.drawable.metamorfala01,))
        _animales.add(AnimalModelo(5, "Muerte Susurrante", R.drawable.muerte01))
        _animales.add(AnimalModelo(6, "Furia Nocturna", R.drawable.furia01))




        animales = _animales

    }


}