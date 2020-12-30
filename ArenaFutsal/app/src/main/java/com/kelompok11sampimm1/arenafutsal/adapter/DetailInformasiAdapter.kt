package com.kelompok11sampimm1.arenafutsal.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kelompok11sampimm1.arenafutsal.DetailInformasiScroll
import com.kelompok11sampimm1.arenafutsal.R
import com.kelompok11sampimm1.arenafutsal.model.DetailInformasiModel
import kotlinx.android.synthetic.main.item_detail.view.*

class DetailInformasiAdapter(
    val detailInformasi: ArrayList<DetailInformasiModel>,
    val context: Context
) :
    RecyclerView.Adapter<DetailInformasiAdapter.ViewHolder>() {
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(detailInformasiModel: DetailInformasiModel, context: Context) {

            Glide.with(context)
                .load(detailInformasiModel.photo)
                .into(view.ivDetail)
            view.tvTitle.text = detailInformasiModel.title
            view.tvDetail.text = detailInformasiModel.desc

            view.cardView.setOnClickListener {
                val intent = Intent(context, DetailInformasiScroll::class.java).putExtra(
                    "extra",
                    detailInformasiModel
                )
                context.startActivity(intent)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(detailInformasi[position], context)
    }

    override fun getItemCount(): Int = detailInformasi.size

}