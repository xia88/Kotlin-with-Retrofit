/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:26 PM
 *
 */

package com.twinggo.moviepedia.repository.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private var retrofit: Retrofit? = null

    fun getApiBuilder(): ApiInterface {
        return retrofit()!!.create(ApiInterface::class.java)
    }

    private fun retrofit(): Retrofit? {

        if(retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(ApiCons.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        return retrofit
    }
}