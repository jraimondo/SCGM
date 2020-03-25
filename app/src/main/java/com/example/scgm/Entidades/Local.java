package com.example.scgm.Entidades;

import android.provider.BaseColumns;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = Local.TABLE_NAME)
public class Local {
    public static final String TABLE_NAME = "Locales";
    public static final String COLUMN_ID = "ID";

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(index = true, name = COLUMN_ID)
    private long ID;

    @ColumnInfo(name = "Nombre")
    private String Nombre;

    @ColumnInfo(name = "Direccion")
    private String Direccion;

    @ColumnInfo(name = "Telefono")
    private long Telefono;

    public Local(){};

    public Local(String nombre, String direccion, long telefono) {
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
    }

    public Local(long ID, String nombre, String direccion, long telefono) {
        this.ID = ID;
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long telefono) {
        Telefono = telefono;
    }
}
