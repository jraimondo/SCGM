package com.example.scgm.Database;

import androidx.room.ColumnInfo;

public class ListaEspecialidades {

    public String Especialidad;

    @ColumnInfo(name = "numeroDeEspecialistas")
    public long numeroDeEspecialsitas;

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public long getNumeroDeEspecialsitas() {
        return numeroDeEspecialsitas;
    }

    public void setNumeroDeEspecialsitas(long numeroDeEspecialsitas) {
        this.numeroDeEspecialsitas = numeroDeEspecialsitas;
    }
}
