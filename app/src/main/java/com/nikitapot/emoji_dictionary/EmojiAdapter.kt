package com.nikitapot.emoji_dictionary

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView



class EmojiAdapter(val emoji: ArrayList<String>) : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row,parent,false))
    }

    override fun getItemCount(): Int {
        return emoji.count()
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        val emoji = emoji[position]
        holder.bindEmoji(emoji)
    }


    class TextHolder(v: View) : RecyclerView.ViewHolder(v),View.OnClickListener{
       var view: View = v
        var emoji: String = ""
            init {
                v.setOnClickListener(this)
            }

        fun bindEmoji(emoji: String){
           this.emoji = emoji
            view.findViewById<TextView>(R.id.itemTextView).text = emoji
        }
        override fun onClick(v: View?) {
            val detailIntent  = Intent(view.context,EmojiDetailActivity::class.java)
            detailIntent.putExtra("emoji",emoji)
            startActivity(view.context,detailIntent,null)
        }

    }


}