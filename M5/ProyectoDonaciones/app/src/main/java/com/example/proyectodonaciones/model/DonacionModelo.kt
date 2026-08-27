package com.example.proyectodonaciones.model

object DonacionModelo {
    var totalAmount = 0

    fun saveDonation(donationAmount: Int) : Boolean {
        totalAmount += donationAmount
        return true
    }

}