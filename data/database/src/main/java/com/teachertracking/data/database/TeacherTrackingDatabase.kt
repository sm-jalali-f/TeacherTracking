package com.teachertracking.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.teachertracking.data.database.dao.ClubsDao
import com.teachertracking.data.database.dao.StudentsDao
import com.teachertracking.data.database.entity.ClubEntity
import com.teachertracking.data.database.entity.EventEntity
import com.teachertracking.data.database.entity.StudentEntity

@Database(entities = [
    StudentEntity::class,
    EventEntity::class,
    ClubEntity::class
], version = 1)
internal abstract class TeacherTrackingDatabase : RoomDatabase() {

    abstract fun studentsDao(): StudentsDao

    abstract fun clubsDao(): ClubsDao

}