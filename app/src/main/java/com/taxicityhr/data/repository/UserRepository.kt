package com.taxicityhr.data.repository

import com.taxicityhr.data.model.User

interface UserRepository {
    suspend fun createUser(user: User): Result<String>
    suspend fun getUser(uid: String): Result<User>
    suspend fun updateUser(user: User): Result<Unit>
    suspend fun deleteUser(uid: String): Result<Unit>
}