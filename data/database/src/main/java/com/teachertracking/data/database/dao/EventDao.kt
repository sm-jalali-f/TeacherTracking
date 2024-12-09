package com.teachertracking.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.teachertracking.data.database.entity.EventEntity
import com.teachertracking.data.database.entity.EventWithDetailEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addEvent(event: EventEntity)

    @Delete
    suspend fun removeEvent(event: EventEntity)

    @Transaction
    @Query("SELECT * FROM events WHERE id= :eventId")
    suspend fun getEvent(eventId: Long): EventWithDetailEntity

    @Transaction
    @Query("SELECT * FROM events")
    fun getAllEvent(): Flow<List<EventWithDetailEntity>>

}