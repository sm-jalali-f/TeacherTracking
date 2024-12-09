package com.teachertracking.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.teachertracking.data.database.entity.ClubEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ClubsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addClub(club: ClubEntity)

    @Delete
    suspend fun deleteClub(club: ClubEntity)

    @Query("SELECT * FROM clubs")
    fun getAllClubs(): Flow<List<ClubEntity>>
}