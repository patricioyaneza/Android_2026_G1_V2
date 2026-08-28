package com.example.proyectodonacionesg2.model

object Donacion {
    var totalAmount = 0

    fun saveDonation(donationAmount: Int): Boolean {
        totalAmount += donationAmount
        return true
    }
}