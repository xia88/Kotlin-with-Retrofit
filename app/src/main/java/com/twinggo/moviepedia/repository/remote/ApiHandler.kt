/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:26 PM
 *
 */

package com.twinggo.moviepedia.repository.remote

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class ApiHandler<T>: Callback<T> {
    override fun onResponse(call: Call<T>, response: Response<T>) {
        if(response.isSuccessful && response.body() != null){
            onRequestSuccess(response.body())
        } else {
            onRequestError(response.code(), response.errorBody())
        }
    }

    override fun onFailure(call: Call<T>, t: Throwable) {
        onNetworkFailure(t)
    }

    abstract fun onRequestSuccess(data: T?)
    abstract fun onRequestError(errorCode: Int, errorBody: ResponseBody?)
    abstract fun onNetworkFailure(throwable: Throwable)

}