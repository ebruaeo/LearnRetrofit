package com.example.learnretrofit

import com.google.gson.annotations.SerializedName

data class AlbumItem(
    // is an annotation in Json which is used to map a Json key to a data field during serialization or deserialization
    // Basically, It allows you to specify a custom name for the key
    // If it differs from the data field name to ensure a proper conversion between Json and data
    @SerializedName("id")
    val id : Int,
    @SerializedName("userId")
    val userId: Int,
    @SerializedName("title")
    val title: String)
