package com.deknowh.apicall.data.remote.model

import com.google.gson.annotations.SerializedName

data class FruitResource(
    @SerializedName("title")
    val title: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nutritions")
    val nutrition: Nutritions,
    @SerializedName("author")
    val author: String,
) {
    data class Nutritions(
        @SerializedName("calories")
        val calories: Int,
        @SerializedName("carbohydrates")
        val carbohydrate: Double,
        @SerializedName("fat")
        val fat: Double,
        @SerializedName("protein")
        val protien: Double,
        @SerializedName("sugar")
        val sugar: Double
    )
}
