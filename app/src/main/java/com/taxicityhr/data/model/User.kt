package com.taxicityhr.data.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val uid: String = "",
    val name: String = "",
    val email: String = "",
    val phoneNumber: String = "",
    val profilePhotoUrl: String? = null,
    val rideHistory: List<String> = emptyList(),
    val rating: Double = 5.0,
    val createdAt: Long = System.currentTimeMillis(),
    val lastLogin: Long = System.currentTimeMillis()
)