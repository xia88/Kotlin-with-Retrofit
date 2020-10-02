/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 9:49 PM
 *
 */

/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 8:46 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:46 PM
 *
 */

package com.twinggo.moviepedia.view.mainavtivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.twinggo.moviepedia.R
import com.twinggo.moviepedia.model.ResultGenres
import com.twinggo.moviepedia.repository.mainactivity.MainActivityRepository
import com.twinggo.moviepedia.repository.remote.ApiClient
import com.twinggo.moviepedia.repository.remote.ApiHandler
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody

class MainActivity : AppCompatActivity() {

    private lateinit var m_adapt_genre: AdapterGenre
    private lateinit var m_adapt_trend: AdapterTrend


    private val m_repo: MainActivityRepository by lazy { MainActivityRepository(ApiClient.getApiBuilder()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecycler()

        m_repo.getGenre(object: ApiHandler<ResultGenres>(){
            override fun onRequestSuccess(data: ResultGenres?) {
                m_adapt_genre.setDataList(data?.genres!!)
            }

            override fun onRequestError(errorCode: Int, errorBody: ResponseBody?) {
                println("ERROR")
            }

            override fun onNetworkFailure(throwable: Throwable) {
                println("NETWORK FAILURE")
            }

        })
    }


    private fun setupRecycler(){
        m_adapt_genre = AdapterGenre()
        m_adapt_trend = AdapterTrend()
        genres_recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = m_adapt_genre
        }
    }
}