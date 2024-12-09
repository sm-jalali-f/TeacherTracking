package com.teachertracking.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "clubs"
)
data class ClubEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "latitude") val latitude: String,
    @ColumnInfo(name = "longitude") val longitude: String,
    @ColumnInfo(name = "rent_cost_per_hour") val rentCostPerHour: Long,
    @ColumnInfo(name = "phone_number") val phoneNumber: String
)
