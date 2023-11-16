package com.ishantejas.accbtproj.data.mapper

import com.ishantejas.accbtproj.data.model.Room
import com.ishantejas.accbtproj.data.model.User
import com.ishantejas.accbtproj.data.response.RoomResponse
import com.ishantejas.accbtproj.data.response.UserResponse


fun RoomResponse.mapToRoom(): Room = Room(
    id, name, facility, building,
)

fun UserResponse.mapToUser(): User =
    User(id, userName, supervisor, objectID, realName, facility, building)