package com.ishantejas.accbtproj.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.parcelize.RawValue


//data class HeartRateData (
//    @SerializedName("timestamp" ) var timestamp : String? = null,
//    @SerializedName("heartRate" ) var heartRate : Int?    = null
//)
@Parcelize
data class HeartRateData(
    val timestamp: String,
    val heartRate: Int
) : Parcelable
