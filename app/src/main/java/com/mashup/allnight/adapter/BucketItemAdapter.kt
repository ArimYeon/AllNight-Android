package com.mashup.allnight.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mashup.allnight.R
import com.mashup.allnight.dataclass.DataList
import com.mashup.allnight.viewholder.BucketItemViewHolder
import com.mashup.allnight.viewholder.SearchResultViewHolder


class BucketItemAdapter (private var itemList : MutableList<DataList>):RecyclerView.Adapter<BucketItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BucketItemViewHolder {
        val viewHolder: BucketItemViewHolder

        val view = LayoutInflater.from(parent.context).inflate(R.layout.bucket_item, parent, false)
        viewHolder = BucketItemViewHolder(view)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: BucketItemViewHolder, position: Int) {
        holder.bind(itemList[position])
    }
}