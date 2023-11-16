package com.ishantejas.accbtproj.data.repo

import com.ishantejas.accbtproj.data.model.User
import com.ishantejas.accbtproj.data.remote.api.HazmatApi
import com.ishantejas.accbtproj.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProfileRepository @Inject constructor(
    private val api: HazmatApi,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) {

//    fun getUsersActive(): Flow<List<User>> {
//        return flow { emit(api.getAllUsersActive().values.map { it.mapToUser() }) }
//            .flowOn(ioDispatcher)
//    }
}