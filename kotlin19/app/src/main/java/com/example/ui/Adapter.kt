package com.example.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin19.databinding.ItemBinding
import com.example.remote.model.itemModel


class Adapter():RecyclerView.Adapter<Adapter.ItemViewHolder>(){
    var list = arrayListOf<itemModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       return ItemViewHolder( ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       holder.onBind(list[position])
    }

    inner class ItemViewHolder( private val binding: ItemBinding):RecyclerView.ViewHolder(binding.root){
        fun  onBind(item:itemModel){
            with(binding){
                tvName.text = item.name
                tvAge.text = item.age.toString()
                tvAlive.text = item.isAlive.toString()
                tvGender.text = item.human
                tvHeight.text = item.height.toString()
                tvNationality.text = item.nationality

            }

        }
    }
}