package com.example.scgm.Entidades;

import android.provider.BaseColumns;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = Especialista.TABLE_NAME)
public class Especialista {
    public static final String TABLE_NAME = "Especialistas";
    public static final String COLUMN_ID = "ID";

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(index = true, name = COLUMN_ID)
    private long ID;

    @ColumnInfo(name = "Nombre")
    private String Nombre;


    @ColumnInfo(name = "Especialidad")
    private String Especialidad;

    public Especialista(){}

    public Especialista(String nombre, String especialidad) {
        Nombre = nombre;
        Especialidad = especialidad;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }
}
