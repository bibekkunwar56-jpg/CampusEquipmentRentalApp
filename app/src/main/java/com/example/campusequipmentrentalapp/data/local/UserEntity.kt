package com.example.campusequipmentrentalapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val loginId: String,
    val name: String,
    val department: String,
    val role: String
)