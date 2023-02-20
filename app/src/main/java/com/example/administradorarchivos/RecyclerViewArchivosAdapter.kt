package com.example.administradorarchivos

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewArchivosAdapter(
    private val contexto: RecyclerViewArchivos,
    private val lista: ArrayList<Archivo>,
    private val recyclerView: RecyclerView
) : RecyclerView.Adapter<RecyclerViewArchivosAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dir: TextView
        val icono: ImageView
        val nombreArchivo: TextView
        val cantidadElementos: TextView
        val fechaCreacion: TextView

        init {
            dir = view.findViewById(R.id.tv_dir)
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
                R.layout.recycler_view_archivo,
                parent,
                false
            )
        return MyViewHolder(itemView)
    }

    // Setear los datos para la iteración
    override fun onBindViewHolder(
        holder: RecyclerViewArchivosAdapter.MyViewHolder,
        position: Int
    ) {
        val archivoactual = this.lista[position]
        holder.icono.id = archivoactual.icono!!
        holder.nombreArchivo.text = archivoactual.nombre
        holder.cantidadElementos.text = archivoactual.cantidadElementos.toString()
        holder.fechaCreacion.text = archivoactual.fechaCreación.toString()
    }

    // Tamaño del arreglo
    override fun getItemCount(): Int {
        return this.lista.size
    }

}