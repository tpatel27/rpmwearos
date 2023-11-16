package com.ishantejas.accbtproj.data.remote.api

import com.ishantejas.accbtproj.data.model.HeartRateData
import com.ishantejas.accbtproj.data.model.WorkoutResponse
import com.ishantejas.accbtproj.data.response.HeartDataResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface WorkoutApi {
    @GET("workouts")
    suspend fun getWorkouts(): WorkoutResponse

    @POST("Prod/rpmLambda-dev")
    suspend fun pushHeartRateData(@Body heartRateData: HeartRateData): HeartDataResponse
}
