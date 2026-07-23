package com.taxicityhr.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PricingInfo(
    val basePrice: Double = 10.0,
    val pricePerKm: Double = 7.5,
    val pricePerMinute: Double = 0.3,
    val minimumPrice: Double = 25.0,
    val surgeMultiplier: Double = 1.0,
    val currency: String = "HRK"
) {
    fun calculatePrice(distanceKm: Double, durationMinutes: Int): Double {
        val distancePrice = distanceKm * pricePerKm
        val waitingPrice = durationMinutes * pricePerMinute
        var totalPrice = basePrice + distancePrice + waitingPrice
        
        totalPrice *= surgeMultiplier
        return maxOf(totalPrice, minimumPrice)
    }
}