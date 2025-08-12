package com.example.gitp2

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LanguageRecyclerView() : RecyclerView.Adapter<LanguageRecyclerView.LanguageViewHolder>() {
    private val languageList = ArrayList<LanguageData>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LanguageViewHolder {
       return when (viewType) {
            0 -> {
                LanguageViewHolder()
            }

            1 -> {
                LanguageViewHolder()
            }
            else -> {
                LanguageViewHolder()
            }
        }
    }

    override fun onBindViewHolder(
        holder: LanguageViewHolder,
        position: Int
    ) {
        when (holder) {
            is LanguageViewHolder.Type1ViewHolder -> {

            }
            is LanguageViewHolder.Type2ViewHolder -> {

            }
        }
    }

    override fun getItemCount() = languageList.size

    override fun getItemViewType(position: Int) = languageList[position].type


    sealed class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        class Type1ViewHolder(itemView: View) : LanguageViewHolder(itemView){

        }
        class Type2ViewHolder(itemView: View) : LanguageViewHolder(itemView){

        }

    }
}