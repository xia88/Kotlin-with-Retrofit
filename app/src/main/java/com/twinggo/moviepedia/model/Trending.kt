/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:32 PM
 *
 */

package com.twinggo.moviepedia.model


import com.google.gson.annotations.SerializedName

data class Trending(
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("video")
    var video: Boolean? = null,
    @SerializedName("vote_count")
    var voteCount: Int? = null,
    @SerializedName("vote_average")
    var voteAverage: Double? = null,
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("release_date")
    var releaseDate: String? = null,
    @SerializedName("original_language")
    var originalLanguage: String? = null,
    @SerializedName("original_title")
    var originalTitle: String? = null,
    @SerializedName("genre_ids")
    var genreIds: List<Int>? = null,
    @SerializedName("backdrop_path")
    var backdropPath: String? = null,
    @SerializedName("adult")
    var adult: Boolean? = null,
    @SerializedName("overview")
    var overview: String? = null,
    @SerializedName("poster_path")
    var posterPath: String? = null,
    @SerializedName("popularity")
    var popularity: Double? = null,
    @SerializedName("media_type")
    var mediaType: String? = null,
    @SerializedName("original_name")
    var originalName: String? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("first_air_date")
    var firstAirDate: String? = null,
    @SerializedName("origin_country")
    var originCountry: List<String>? = null
)