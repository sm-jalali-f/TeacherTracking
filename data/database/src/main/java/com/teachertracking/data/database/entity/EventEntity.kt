package com.teachertracking.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "events",
    foreignKeys = [
        ForeignKey(
            entity = ClubEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("club_id")
        ),
        ForeignKey(
            entity = StudentEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("student_id")
        )
    ]
)
data class EventEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "time") val time: String,
    @ColumnInfo(name = "cost") val cost: Int,
    @ColumnInfo(name = "club_cost") val clubCost: Int,
    @ColumnInfo(name = "club_id") val clubId: Long,
    @ColumnInfo(name = "student_id") val studentId: Long

)