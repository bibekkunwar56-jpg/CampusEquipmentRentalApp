package com.example.campusequipmentrentalapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "study_tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    val groupId: Int,
    val userId: String,
    val taskTitle: String,
    val dueDate: String,
    val status: String // "IN_PROGRESS" or "COMPLETED"
)