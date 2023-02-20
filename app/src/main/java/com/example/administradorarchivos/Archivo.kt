package com.example.administradorarchivos

import android.graphics.drawable.Drawable
import android.os.Parcel
import android.os.ParcelFileDescriptor
import android.os.Parcelable
import java.io.FileInputStream
import java.util.Date

class Archivo(
    var dir: String?,
    var icono: Int?,
    var nombre: String?,
    var cantidadElementos: Int?,
    var fechaCreación: Date?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        Date(parcel.readLong())
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeValue(cantidadElementos)
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