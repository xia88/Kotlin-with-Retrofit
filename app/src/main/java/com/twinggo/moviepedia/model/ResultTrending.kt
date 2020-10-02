/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:32 PM
 *
 */

package com.twinggo.moviepedia.model


import com.google.gson.annotations.SerializedName

data class ResultTrending(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("results")
    var results: List<Trending>? = null,
    @SerializedName("total_pages")
    var totalPages: Int? = null,
    @SerializedName("total_results")
    var totalResults: Int? = null
)