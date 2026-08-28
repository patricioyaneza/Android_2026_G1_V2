package com.example.proyectodonacionesg2.model

class DonationModel {
    var totalAmount = 0
       // private set

    fun saveDonation(donationAmount: Int): Boolean {
        totalAmount += donationAmount
        return true
    }
    fun getDonationAMount(): Int {
        return totalAmount
    }
}