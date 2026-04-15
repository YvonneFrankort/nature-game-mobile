package com.example.naturegame.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Entity(tableName = "nature_spots")
data class NatureSpot(
    @PrimaryKey val id: String,

    val name: String,
    val latitude: Double,
    val longitude: Double,

    val imageLocalPath: String? = null,
    val imageFirebaseUrl: String? = null,

    val plantLabel: String? = null,
    val confidence: Float? = null,

    val note: String? = null,

    val userId: String? = null,
    val timestamp: Long = System.currentTimeMillis(),

    val synced: Boolean = false,

    val readableDate: String = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
        .format(Date())
)
