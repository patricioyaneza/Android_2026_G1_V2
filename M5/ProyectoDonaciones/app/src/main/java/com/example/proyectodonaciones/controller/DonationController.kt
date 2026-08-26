package com.example.proyectodonaciones.controller

import com.example.proyectodonaciones.model.DonationModel

class DonationController {
    private val model: DonationModel

    init {
        model = DonationModel()
    }

    fun save(amount: Int): Boolean {
        return model.saveDonation(amount)
    }

    fun getTotalAmount(): Int {
        return model.totalAmount
    }
}