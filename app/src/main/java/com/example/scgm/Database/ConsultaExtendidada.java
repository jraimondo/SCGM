package com.example.scgm.Database;

import androidx.room.ColumnInfo;
import androidx.room.DatabaseView;
import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.scgm.Entidades.Consulta;
import com.example.scgm.Entidades.Especialista;

public class ConsultaExtendidada {

    @ColumnInfo(name = "ID")
    public long ID;

    @ColumnInfo(name = "ID_Usuario")
    public long ID_usuario;

    @ColumnInfo(name = "Fecha")
    public String Fecha;

    @ColumnInfo(name = "Hora")
    public String Hora;

    @ColumnInfo(name = "Comentario")
    public String Comentario;

    @ColumnInfo(name = "nombreEspecialista")
    public String nombreEspecialista;

    @ColumnInfo(name = "Especialidad")
    public String Especialidad;

    @ColumnInfo(name = "nombreLocal")
    public String nombreLocal;

    @ColumnInfo(name = "Direccion")
    public String Direccion;

    @ColumnInfo(name = "Telefono")
    public String telefono;

    public long getID() {
        return ID;
    }

    public long getID_usuario() {
        return ID_usuario;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public String getComentario() {
        return Comentario;
    }

    public String getNombreEspecialista() {
        return nombreEspecialista;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
