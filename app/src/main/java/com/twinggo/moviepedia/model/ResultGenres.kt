/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:24 PM
 *
 */

package com.twinggo.moviepedia.model


import com.google.gson.annotations.SerializedName

data class ResultGenres(
    @SerializedName("genres")
    var genres: List<Genre>? = null
)