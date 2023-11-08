package com.example.googleplay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val context: Context, private val dataset: ArrayList<ArrayItem>) : RecyclerView.Adapter<ItemAdapter.ItemHolder>(){

    class ItemHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val type = view.findViewById<TextView>(R.id.textView)
        val rv = view.findViewById<RecyclerView>(R.id.group_items)
    }

    class AppAdapter (private val apps : ArrayList<Items>) : RecyclerView.Adapter<AppAdapter.ItemHolder>(){

        class ItemHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val thumb : ImageView
            val name : TextView
            val rate : TextView
            init {
                thumb = view.findViewById(R.id.imageView)
                name = view.findViewById(R.id.name)
                rate = view.findViewById(R.id.rate)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
            val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
            return ItemHolder(adapterLayout)
        }

        override fun getItemCount() = apps.size

        override fun onBindViewHolder(holder: ItemHolder, position: Int) {
            holder.thumb.setImageResource(apps[position].thumb)
            holder.name.text = apps[position].name
            holder.rate.text = apps[position].rate
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.group_items, parent, false)
        return ItemHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.type.text = dataset[position].type
        holder.rv.adapter = AppAdapter(dataset[position].Apps)
        holder.rv.layoutManager = LinearLayoutManager(holder.view.context, LinearLayoutManager.HORIZONTAL, false)
    }

}