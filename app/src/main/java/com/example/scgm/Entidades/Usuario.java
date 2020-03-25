package com.example.scgm.Entidades;

import android.provider.BaseColumns;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.OnConflictStrategy;
import androidx.room.PrimaryKey;

@Entity(tableName = Usuario.TABLE_NAME)
public class Usuario {
    public static final String TABLE_NAME = "Usuarios";
    public static final String COLUMN_ID = "ID";


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(index = true, name = COLUMN_ID)
    private long ID;

    @ColumnInfo(name = "Cedula")
    private long Cedula;

    @ColumnInfo(name = "Nombre")
    private String Nombre;

    @ColumnInfo(name = "Apellido")
    private String Apellido;

    @ColumnInfo(name = "Mail")
    private String Mail;

    @ColumnInfo(name = "Telefono")
    private long Telefono;

    @ColumnInfo(name = "Passwd")
    private String Passwd;

    @ColumnInfo(name = "Is_Admin")
    private Boolean Is_Admin;

    public Usuario(){};

    public Usuario(long cedula, String nombre, String apellido, String mail, long telefono, String passwd, Boolean is_Admin) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Mail = mail;
        Telefono = telefono;
        Passwd = passwd;
        Is_Admin = is_Admin;
    }

    public Usuario(long ID, long cedula, String nombre, String apellido, String mail, long telefono, String passwd, Boolean is_Admin) {
        this.ID = ID;
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Mail = mail;
        Telefono = telefono;
        Passwd = passwd;
        Is_Admin = is_Admin;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getCedula() {
        return Cedula;
    }

    public void setCedula(long cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long telefono) {
        Telefono = telefono;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String passwd) {
        Passwd = passwd;
    }

    public Boolean getIs_Admin() {
        return Is_Admin;
    }

    public void setIs_Admin(Boolean is_Admin) {
        Is_Admin = is_Admin;
    }
}
