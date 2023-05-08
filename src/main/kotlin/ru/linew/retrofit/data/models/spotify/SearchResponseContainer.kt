package ru.linew.retrofit.data.models.spotify

import com.google.gson.annotations.SerializedName

data class SearchResponseContainer(
    @SerializedName("tracks")
    val searchResponse: SearchResponse
)


