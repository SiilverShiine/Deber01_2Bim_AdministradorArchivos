package com.example.administradorarchivos

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class RecyclerViewArchivosList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        //Definir lista
        val listarArchivos = DataClassArchivos.listarArchivos

        //Inicializar recycler view
        val recyclerView = findViewById<RecyclerView>(R.id.rv_archivos)
        inicializarRecyclerView(listarArchivos, recyclerView)

        val botonVista = findViewById<ImageButton>(R.id.btn_change_view)
        botonVista.foreground = ContextCompat.getDrawable(this, R.drawable.tabla_layout)
        botonVista.setOnClickListener{
            irActividad(RecyclerViewArchivosGrid::class.java)
        }
    }

    fun inicializarRecyclerView(
        lista: ArrayList<Archivo>,
        recyclerView: RecyclerView
    ) {
        val adaptador = RecyclerViewArchivosAdapterList(lista)
        recyclerView.adapter = adaptador
        recyclerView.itemAnimator = androidx.recyclerview.widget.DefaultItemAnimator()
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        adaptador.notifyDataSetChanged()
    }

    fun irActividad(
        clase: Class<*>
    ){
        val intent = Intent(this, clase)
        startActivity(intent)
    }
}