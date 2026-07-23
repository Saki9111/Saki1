package com.taxicityhr.data.repository

import com.taxicityhr.data.model.Ride
import kotlinx.coroutines.flow.Flow

interface RideRepository {
    suspend fun createRide(ride: Ride): Result<String>
    suspend fun getRide(rideId: String): Result<Ride>
    suspend fun getUserRides(userId: String): Result<List<Ride>>
    suspend fun updateRideStatus(rideId: String, status: String): Result<Unit>
    suspend fun cancelRide(rideId: String): Result<Unit>
    fun observeRide(rideId: String): Flow<Ride>
}