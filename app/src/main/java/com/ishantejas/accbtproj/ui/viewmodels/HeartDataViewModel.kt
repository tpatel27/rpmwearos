package com.ishantejas.accbtproj.ui.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ishantejas.accbtproj.data.model.HeartRateData
import com.ishantejas.accbtproj.data.repo.WorkoutRepository
import com.ishantejas.accbtproj.data.response.HeartDataResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HeartDataViewModel @Inject constructor(
    private val repository: WorkoutRepository,
) : ViewModel() {

    private val _resultResponse = MutableLiveData<Result<HeartDataResponse>>()
    val resultResponse: LiveData<Result<HeartDataResponse>> = _resultResponse
    private val tag = "HeartDataViewModel"

    fun pushHeartRateData(
        heartRateData: HeartRateData
    ) {
        viewModelScope.launch {
            repository.pushHeartData(
                heartRateData = heartRateData
            ).catch {
                Log.d(tag, "pushHeartRateData: Error pushing")
            }.collect { response ->
                if(response.isSuccess) {
                    Log.d(tag, "pushHeartRateData: $response")
                } else {
                    Log.e(tag, "pushHeartRateData: Something gone wrong.")
                }
            }
        }
    }
}