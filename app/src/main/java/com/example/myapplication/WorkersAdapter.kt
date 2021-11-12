package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.work.Worker

//class WorkersAdapter(private val workerList: List<Worker>): RecyclerView.Adapter<WorkersAdapter.WorkerViewHolder>() {
//
//    override fun getItemCount(): Int = workerList.size
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkerViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        val view =layoutInflater.inflate(R.layout.item_worker, parent, false)
//        return WorkerViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: WorkerViewHolder, position: Int) {
//        holder.bind(workerList[position])
//    }
//
//
//    class WorkerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        private val tvName: TextView
//
//        val bind: Any = TODO()
//    }
//
//
//}