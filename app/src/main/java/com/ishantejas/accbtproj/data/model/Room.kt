package com.ishantejas.accbtproj.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Room(
    val id: Long,
    val name: String,
    val facility: Long,
    val building: Long
): Parcelable