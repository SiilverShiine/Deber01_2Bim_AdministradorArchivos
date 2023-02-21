package com.example.administradorarchivos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewArchivosAdapterList(private val lista: ArrayList<Archivo>) :
    RecyclerView.Adapter<RecyclerViewArchivosAdapterList.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //val dir: TextView
        val icono: ImageView
        val nombreArchivo: TextView
        val cantidadElementos: TextView
        val fechaCreacion: TextView

        init {
            icono = view.findViewById(R.id.iv_icono)
            nombreArchivo = view.findViewById(R.id.tv_nombre_archivo)
            cantidadElementos = view.findViewById(R.id.tv_cantidad_elementos)
            fechaCreacion = view.findViewById(R.id.tv_fecha_creacion)
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.recycler_view_archivo_list,
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
        holder.cantidadElementos.text = archivoactual.cantidadElementos.toString()
        holder.fechaCreacion.text = archivoactual.fechaCreacion.toString()
    }

    // Tamaño del arreglo
    override fun getItemCount(): Int {
        return this.lista.size
    }

}