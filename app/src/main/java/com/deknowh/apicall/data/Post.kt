package com.deknowh.apicall.data

import com.deknowh.apicall.data.remote.model.FruitResource
import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("title")
    val title: String,
    @SerializedName("author")
    val author: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nutritions")
    val nutrition: FruitResource.Nutritions,
    @SerializedName("order")
    val order: String
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

//val post = Post(
//    id = 1,
//    title = "Example Post",
//    body = "This is an example of a post body.",
//    author = "John Doe",
//    timestamp = 1648429200
//)
