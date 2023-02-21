package com.example.administradorarchivos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewArchivosAdapterGrid(private val lista: ArrayList<Archivo>) :
    RecyclerView.Adapter<RecyclerViewArchivosAdapterGrid.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //val dir: TextView
        val icono: ImageView
        val nombreArchivo: TextView

        init {
            icono = view.findViewById(R.id.iv_icono_grid)
            nombreArchivo = view.findViewById(R.id.tv_nombre_archivo_grid)
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.recycler_view_archivo_grid,
                parent,
                false
            )
        return MyViewHolder(itemView)
    }

    // Setear los datos para la iteración
    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        val archivoactual = this.lista[position]
        //holder.dir.text = archivoactual.dir
        holder.icono.setImageResource(archivoactual.icono)
        holder.nombreArchivo.text = archivoactual.nombre
    }

    // Tamaño del arreglo
    override fun getItemCount(): Int {
        return this.lista.size
    }

}