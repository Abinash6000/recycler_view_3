package com.project.recyclerview3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.recyclerview3.R
import com.project.recyclerview3.model.Item

class ItemAdapter(private val context: Context, private val myData: List<Item>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val author: ImageView = ItemView.findViewById(R.id.imageview)
        val quote: TextView = ItemView.findViewById(R.id.textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.author.setImageResource(myData[position].author)
        holder.quote.text = myData[position].quote
    }

    override fun getItemCount() = myData.size
}