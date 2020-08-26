package com.example.bottomnavigation.Ui


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat

import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigation.Data.DataClass
import com.example.bottomnavigation.Fragment.CityFragment
import com.example.bottomnavigation.Fragment.InterfaceRecycler
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.item_linear.view.*

class RecyclerAdapter(private val listener: InterfaceRecycler) :
    RecyclerView.Adapter<RecyclerAdapter.RecyclerviewHolder>() {
    private val data = arrayListOf<DataClass>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_linear, parent, false)
        return RecyclerviewHolder(view)

    }

    fun addingList(item: DataClass) {
        data.add(item)
        notifyItemInserted(1)
    }

    fun update(data: ArrayList<DataClass>) {
        data.clear()
        data.addAll(data)
        notifyDataSetChanged()
    }


    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: RecyclerviewHolder, position: Int) {
        holder.bind(data[position], listener)
    }

    class RecyclerviewHolder(v: View) : RecyclerView.ViewHolder(v) {
        fun bind(
            item: DataClass,
            lis: InterfaceRecycler
        ) {
            itemView.setOnClickListener {
                lis.newPage(item)
            }
            itemView.textView9.text = item.cityName
            itemView.Image.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.img))
        }
    }
}