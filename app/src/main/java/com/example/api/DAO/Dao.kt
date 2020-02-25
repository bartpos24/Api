package com.example.api.DAO

import androidx.room.Dao
import androidx.room.Insert
import com.example.api.Model.User

@Dao
interface Dao {
    @Insert
    suspend fun addUser(user: User)
}