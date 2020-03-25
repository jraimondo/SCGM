package com.example.scgm.Entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = Consulta.TABLE_NAME)
public class Consulta {
    public static final String TABLE_NAME = "Consultas";
    public static final String COLUMN_ID = "ID";

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(index = true, name = COLUMN_ID)
    private long ID;

    @ForeignKey(entity = Usuario.class, parentColumns = "ID", childColumns = "ID_Usuario", onDelete = 5)
    @ColumnInfo(name = "ID_Usuario")
    private long ID_Usuario;

    @ForeignKey(entity = Especialista.class, parentColumns = "ID", childColumns = "ID_Especialista")
    @ColumnInfo(name = "ID_Especialista")
    private long ID_Especialista;

    @ForeignKey(entity = Local.class, parentColumns = "ID", childColumns = "ID_Local")
    @ColumnInfo(name = "ID_Local")
    private long ID_Local;

    @ColumnInfo(name = "Fecha")
    private String Fecha;

    @ColumnInfo(name = "Hora")
    private String Hora;

    @ColumnInfo(name = "Comentario")
    private String Comentario;

    public Consulta(){};

    public Consulta(long ID_Usuario, long ID_Especialista, long ID_Local, String fecha, String hora) {
        this.ID_Usuario = ID_Usuario;
        this.ID_Especialista = ID_Especialista;
        this.ID_Local = ID_Local;
        Fecha = fecha;
        Hora = hora;
    }

    public Consulta(long ID_Usuario, long ID_Especialista, long ID_Local, String fecha, String hora, String comentario) {
        this.ID_Usuario = ID_Usuario;
        this.ID_Especialista = ID_Especialista;
        this.ID_Local = ID_Local;
        Fecha = fecha;
        Hora = hora;
        Comentario = comentario;
    }

    public Consulta(long ID, long ID_Usuario, long ID_Especialista, long ID_Local, String fecha, String hora, String comentario) {
        this.ID = ID;
        this.ID_Usuario = ID_Usuario;
        this.ID_Especialista = ID_Especialista;
        this.ID_Local = ID_Local;
        Fecha = fecha;
        Hora = hora;
        Comentario = comentario;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(long ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public long getID_Especialista() {
        return ID_Especialista;
    }

    public void setID_Especialista(long ID_Especialista) {
        this.ID_Especialista = ID_Especialista;
    }

    public long getID_Local() {
        return ID_Local;
    }

    public void setID_Local(long ID_Local) {
        this.ID_Local = ID_Local;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }
}
