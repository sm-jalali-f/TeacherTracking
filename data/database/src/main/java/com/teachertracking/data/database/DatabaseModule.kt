package com.teachertracking.data.database

import android.content.Context
import androidx.room.Room
import com.teachertracking.data.database.dao.ClubsDao
import com.teachertracking.data.database.dao.EventDao
import com.teachertracking.data.database.dao.StudentsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): TeacherTrackingDatabase {
        return Room.databaseBuilder(
            context,
            TeacherTrackingDatabase::class.java,
            "teacher-tracking-db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideClubsDap(db: TeacherTrackingDatabase): ClubsDao = db.clubsDao()

    @Provides
    @Singleton
    fun provideStudentsDap(db: TeacherTrackingDatabase): StudentsDao = db.studentsDao()

    @Provides
    @Singleton
    fun provideEventsDap(db: TeacherTrackingDatabase): EventDao = db.eventsDao()
}