package com.taxicityhr.data.model

import com.google.android.gms.maps.model.LatLng
import kotlinx.serialization.Serializable

@Serializable
data class TaxiLocation(
    val latitude: Double,
    val longitude: Double,
    val address: String = "",
    val timestamp: Long = System.currentTimeMillis()
) {
    fun toLatLng(): LatLng = LatLng(latitude, longitude)
}