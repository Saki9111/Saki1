package com.taxicityhr.util

object Constants {
    const val FIRESTORE_USERS = "users"
    const val FIRESTORE_RIDES = "rides"
    const val FIRESTORE_DRIVERS = "drivers"
    const val FIRESTORE_PRICING = "pricing"

    const val DEFAULT_ZOOM = 15f
    const val CAMERA_ANIMATION_DURATION = 1000

    const val LOCATION_UPDATE_INTERVAL = 5000L
    const val LOCATION_FASTEST_UPDATE_INTERVAL = 2000L
    const val LOCATION_MAX_WAIT_TIME = 15000L

    const val ZAGREB_LATITUDE = 45.8150
    const val ZAGREB_LONGITUDE = 16.0023

    const val DEFAULT_BASE_PRICE = 10.0
    const val DEFAULT_PRICE_PER_KM = 7.5
    const val DEFAULT_PRICE_PER_MINUTE = 0.3
    const val DEFAULT_MINIMUM_PRICE = 25.0
}