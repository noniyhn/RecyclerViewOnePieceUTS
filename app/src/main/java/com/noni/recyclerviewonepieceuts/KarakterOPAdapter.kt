package com.noni.recyclerviewonepieceuts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KarakterOPAdapter (private val context: Context,  private val karakterop: List<KarakterOP>, val listener: (KarakterOP) -> Unit)
    : RecyclerView.Adapter<KarakterOPAdapter.KarakterOPViewholder>(){

    class KarakterOPViewholder(view: View): RecyclerView.ViewHolder(view) {

        val imgKarakterOP = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameKarakterOP = view.findViewById<TextView>(R.id.tv_item_name)
        val descKarakterOP = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(karakterop: KarakterOP, listener: (KarakterOP) -> Unit) {
            imgKarakterOP.setImageResource(karakterop.imgKarakterOP)
            nameKarakterOP.text = karakterop.nameKarakterOP
            descKarakterOP.text = karakterop.descKarakterOP

            itemView.setOnClickListener {
                listener(karakterop)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KarakterOPViewholder {
        return KarakterOPViewholder(
            LayoutInflater.from(context).inflate(R.layout.item_karakterop, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KarakterOPViewholder, position: Int) {
        holder.bindView(karakterop[position], listener)
    }

    override fun getItemCount(): Int = karakterop.size

    }