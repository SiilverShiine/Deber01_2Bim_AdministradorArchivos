package com.example.administradorarchivos

data class DataClassArchivos(val value: Int){
    companion object{
        val listarArchivos = arrayListOf<Archivo>(
            Archivo("root", R.drawable.folder, "Android", 3, "12/1/2022 12:48 p. m."),
            Archivo("root", R.drawable.folder, "ASD", 1, "12/11/2021 2.32 p. m."),
            Archivo("",R.drawable.folder,"BrowserFiction",1,""),
            Archivo("",R.drawable.folder,"CamScanner",1,""),
            Archivo("",R.drawable.folder,"centauri",1,""),
            Archivo("",R.drawable.folder,"CentauriOversea",1,""),
            Archivo("",R.drawable.folder,"com.activision.callofduty.shooter",1,""),
            Archivo("",R.drawable.folder,"DCIM",1,""),
            Archivo("",R.drawable.folder,"documents",1,""),
            Archivo("",R.drawable.folder,"Download",1,""),
            Archivo("",R.drawable.folder,"Fonts",1,""),
            Archivo("",R.drawable.folder,"Geetest",1,""),
            Archivo("",R.drawable.folder,"MIUI",1,""),
            Archivo("",R.drawable.folder,"Movies",1,""),
            Archivo("",R.drawable.folder,"Music",1,""),
            Archivo("",R.drawable.folder,"Notifications",1,""),
            Archivo("",R.drawable.folder,"Pictures",1,""),
            Archivo("",R.drawable.folder,"ramdump",1,""),
            Archivo("",R.drawable.folder,"Telegram",1,""),
        )
    }
}
