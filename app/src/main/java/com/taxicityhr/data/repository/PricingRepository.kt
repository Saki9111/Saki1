package com.taxicityhr.data.repository

import com.taxicityhr.data.model.PricingInfo

interface PricingRepository {
    suspend fun getPricingInfo(): Result<PricingInfo>
    suspend fun calculateRidePrice(distanceKm: Double, durationMinutes: Int): Result<Double>
}