package com.ishantejas.accbtproj.data.dao

import androidx.room.*
import com.ishantejas.accbtproj.data.model.Workout
import kotlinx.coroutines.flow.Flow

@Dao

interface WorkoutDao {

    @Query("SELECT * FROM workout")
    fun getAll(): Flow<List<Workout>>

    @Query("SELECT * FROM workout WHERE id=:id")
    suspend fun getWorkoutById(id: String): Workout

    @Update
    suspend fun update(workout: Workout)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(vararg workouts: Workout)
}