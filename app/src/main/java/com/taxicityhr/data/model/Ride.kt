package com.taxicityhr.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Ride(
    val rideId: String = "",
    val userId: String = "",
    val pickupLocation: TaxiLocation = TaxiLocation(0.0, 0.0),
    val dropoffLocation: TaxiLocation = TaxiLocation(0.0, 0.0),
    val scheduledTime: Long = 0L,
    val status: String = "PENDING",
    val estimatedPrice: Double = 0.0,
    val finalPrice: Double? = null,
    val driverId: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val completedAt: Long? = null
)