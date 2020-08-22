package com.example.bottomnavigation.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataClass(
    val cityName : String,
    val img : Int,
    val description : String

) : Parcelable