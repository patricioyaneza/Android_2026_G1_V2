package com.example.proyectodonacionesg2.controller

import com.example.proyectodonacionesg2.model.DonationModel

class DonationController {
    // Comunico en el Model
    private val model: DonationModel

    init {
        model = DonationModel()
    }

    // llamo la funcion de model guardar
    fun saveDonation(amount: Int): Boolean {
        return model.saveDonation(amount)
    }

    // llamo la funcion de model muestra las  donaciones
    fun totalDonation(): Int {
        return model.getDonationAMount()
    }
}