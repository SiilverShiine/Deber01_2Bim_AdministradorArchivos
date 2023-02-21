package com.example.administradorarchivos

import android.os.Parcel
import android.os.Parcelable
import java.util.Calendar
import java.util.Date

class Archivo(
    var dir: String?,
    var icono: Int,
    var nombre: String?,
    var cantidadElementos: Int,
    var fechaCreacion: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(dir)
        parcel.writeValue(icono)
        parcel.writeString(nombre)
        parcel.writeValue(cantidadElementos)
        parcel.writeString(fechaCreacion)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Archivo> {
        override fun createFromParcel(parcel: Parcel): Archivo {
            return Archivo(parcel)
        }

        override fun newArray(size: Int): Array<Archivo?> {
            return arrayOfNulls(size)
        }
    }
}