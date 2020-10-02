/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 9:51 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 9:48 PM
 *
 */

/*
 * *
 *  * Created by Harris Kristanto on 10/2/20 8:47 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 10/2/20 8:47 PM
 *
 */

package com.twinggo.moviepedia.view.mainavtivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.twinggo.moviepedia.R
import com.twinggo.moviepedia.model.Genre
import kotlinx.android.synthetic.main.activity_main_genre_adapter.view.*

class AdapterGenre: RecyclerView.Adapter<AdapterGenre.ViewHolder>(){

    private var m_listgenre: List<Genre> = emptyList()
    private lateinit var context: Context

    fun setDataList(listgenre: List<Genre>){
        this.m_listgenre = listgenre
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterGenre.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main_genre_adapter, parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterGenre.ViewHolder, position: Int) {
        holder.bindItem(m_listgenre[position])
    }

    override fun getItemCount(): Int {
        return m_listgenre.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItem(m_genre: Genre){
            itemView.genre_name.text = m_genre.name
        }
    }
}