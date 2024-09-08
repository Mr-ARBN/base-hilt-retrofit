package com.example.basehiltretrofit.data.entity.remote

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class TestResponse(
    @Json(name = "createdAt")
    val createdAt: String,
    @Json(name = "data")
    val data: TestDataResponse?,
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String
) {
    @JsonClass(generateAdapter = true)
    data class TestDataResponse(
        @Json(name = "CPU model")
        val cPUModel: String,
        @Json(name = "Hard disk size")
        val hardDiskSize: String,
        @Json(name = "price")
        val price: Double,
        @Json(name = "year")
        val year: Int
    )
}