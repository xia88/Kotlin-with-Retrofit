/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 9:38 PM
 *
 */

/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:33 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 9:33 PM
 *
 */

package com.twinggo.moviepedia.view.mainavtivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.twinggo.moviepedia.model.Genre

class AdapterTrend: RecyclerView.Adapter<AdapterTrend.ViewHolder>(){

    private var m_genre: List<Genre> = emptyList()
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterTrend.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AdapterTrend.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItem(data: Genre){

        }
    }
}