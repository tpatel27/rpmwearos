package com.ishantejas.accbtproj.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ishantejas.accbtproj.data.dao.WorkoutDao
import com.ishantejas.accbtproj.data.model.Assignment
import com.ishantejas.accbtproj.data.model.Workout

class AssignmentConverter {

    @TypeConverter
    fun fromAssignments(assignments: List<Assignment>): String {
        val gson = Gson()
        return gson.toJson(assignments)
    }

    @TypeConverter
    fun toAssignments(json: String): List<Assignment> {
        val gson = Gson()
        val itemType = object : TypeToken<List<Assignment>>() {}.type
        return gson.fromJson(json, itemType)
    }
}

@Database(entities = [Workout::class], version = 1)
@TypeConverters(AssignmentConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun workoutDao(): WorkoutDao
}