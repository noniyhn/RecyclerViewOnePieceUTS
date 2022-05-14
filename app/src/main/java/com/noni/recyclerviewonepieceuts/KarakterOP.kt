package com.noni.recyclerviewonepieceuts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KarakterOP(
    val imgKarakterOP: Int,
    val nameKarakterOP: String,
    val descKarakterOP: String
) : Parcelable
