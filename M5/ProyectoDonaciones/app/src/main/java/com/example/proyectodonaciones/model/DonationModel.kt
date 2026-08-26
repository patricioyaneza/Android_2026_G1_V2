package com.example.proyectodonaciones.model

class DonationModel {
    var totalAmount = 0

    fun saveDonation(donationAmount: Int) : Boolean {
        totalAmount += donationAmount
        return true
    }
}