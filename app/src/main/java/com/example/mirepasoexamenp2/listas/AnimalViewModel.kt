package com.example.mirepasoexamenp2.listas

import androidx.lifecycle.ViewModel
import com.example.mirepasoexamenp2.R

class AnimalViewModel: ViewModel() {
    private val _animales = mutableListOf<AnimalModelo>()
    var animales: List<AnimalModelo> = _animales

    init {
        _animales.add(AnimalModelo(1, "Gato", R.drawable.gato,"Minino",2))
        _animales.add(AnimalModelo(2, "Perro", R.drawable.perro,"Mac",6))
        _animales.add(AnimalModelo(3, "Zorro", R.drawable.zorro,"Ito",4))
        _animales.add(AnimalModelo(4, "Michi", R.drawable.michi,"Mi",1))
        _animales.add(AnimalModelo(5, "Mapache", R.drawable.mapache,"ta",4))
        _animales.add(AnimalModelo(6, "Perezoso", R.drawable.perezoso,"pi",4))
        _animales.add(AnimalModelo(7, "Panda", R.drawable.panda,"po",4))



        animales = _animales

    }


}