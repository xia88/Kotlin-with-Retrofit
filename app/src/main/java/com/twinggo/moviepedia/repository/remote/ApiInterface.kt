/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:40 PM
 *
 */

package com.twinggo.moviepedia.repository.remote

import com.twinggo.moviepedia.model.ResultGenres
import com.twinggo.moviepedia.model.ResultTrending
import com.twinggo.moviepedia.model.Trending
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {
    @GET(ApiCons.TRENDING)
    fun getTrending(
        @Query("api_key") api_key: String,
        @Path("media") media: String,
        @Path("time") time: String
    ) : Call<ResultTrending>

    @GET(ApiCons.GENRES)
    fun getGenres(
        @Query("api_key") api_key: String
    ) : Call<ResultGenres>
}