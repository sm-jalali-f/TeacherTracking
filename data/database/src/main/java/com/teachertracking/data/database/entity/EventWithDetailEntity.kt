package com.teachertracking.data.database.entity

import androidx.room.Embedded
import androidx.room.Relation

data class EventWithDetailEntity(
    @Embedded val event: EventEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "student_id"
    )
    val student: StudentEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "club_id"
    )
    val club: ClubEntity
)
