package com.example.administradorarchivos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class RecyclerViewArchivos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        //Definir lista
        val listarArchivos = arrayListOf<Archivo>()
        listarArchivos
            .add(Archivo("root", R.drawable.folder, "Android", 3, Date(1627655400)))
        listarArchivos
            .add(Archivo("root", R.drawable.folder, "ASD", 1, Date(1645034580)))

        //Inicializar recycler view
        val recyclerView = findViewById<RecyclerView>(R.id.rv_archivos)
        inicializarRecyclerView(listarArchivos, recyclerView)
    }

    fun inicializarRecyclerView(
        lista: ArrayList<Archivo>,
        recyclerView: RecyclerView
    ) {
        val adaptador = RecyclerViewArchivosAdapter(
            this, //contexto
            lista, // Arreglo datos
            recyclerView // Recycler view
        )
        recyclerView.adapter = adaptador
        recyclerView.itemAnimator = androidx.recyclerview.widget.DefaultItemAnimator()
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        adaptador.notifyDataSetChanged()
    }
}