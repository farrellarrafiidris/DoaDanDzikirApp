package com.farrell.doadandzikirapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArtikelModel(
    val imagesAtikel    : Int,
    val titleAtikel     : String,
    val descArtikel     : String
) : Parcelable
