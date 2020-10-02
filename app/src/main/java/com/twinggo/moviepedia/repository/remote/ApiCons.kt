/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:32 PM
 *
 */

package com.twinggo.moviepedia.repository.remote

class ApiCons {
    companion object{
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMG_POSTER = "https://image.tmdb.org/t/p/w185"
        const val TRENDING      = "trending/{media}/{time}"
        const val GENRES        = "genre/movie/list"
        const val TOKEN = "841fd1eee667803295a1299e0f1e7ee5"
    }
}