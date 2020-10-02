/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:40 PM
 *
 */

package com.twinggo.moviepedia.repository.mainactivity

import com.twinggo.moviepedia.model.ResultGenres
import com.twinggo.moviepedia.model.ResultTrending
import com.twinggo.moviepedia.repository.remote.ApiCons
import com.twinggo.moviepedia.repository.remote.ApiHandler
import com.twinggo.moviepedia.repository.remote.ApiInterface

class MainActivityRepository (private val restApi: ApiInterface) {

    fun getGenre(handler: ApiHandler<ResultGenres>){
        restApi.getGenres(ApiCons.TOKEN)
            .enqueue(handler)
    }

    fun getTrend(handler: ApiHandler<ResultTrending>, media: String, time: String){
        restApi.getTrending(ApiCons.TOKEN, media, time)
            .enqueue(handler)
    }


}