package com.teachertracking.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.teachertracking.data.database.entity.StudentEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addStudent(student: StudentEntity)

    @Delete
    suspend fun removeStudent(student: StudentEntity)

    @Query("SELECT * FROM students")
    fun getAllStudents(): Flow<List<StudentEntity>>
}