package com.example.scgm.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.scgm.Entidades.Consulta;
import com.example.scgm.Entidades.Especialista;
import com.example.scgm.Entidades.Local;
import com.example.scgm.Entidades.Usuario;
import com.example.scgm.Interfaces.ConsultaDao;
import com.example.scgm.Interfaces.EspecialistaDao;
import com.example.scgm.Interfaces.LocalDao;
import com.example.scgm.Interfaces.UsuarioDao;

@Database( entities = {Consulta.class, Especialista.class, Local.class, Usuario.class},
        version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    @SuppressWarnings("WeakerAccces")
    public abstract ConsultaDao getConsultaDao();
    public abstract EspecialistaDao getEspecialistaDao();
    public abstract LocalDao getLocalDao();
    public abstract UsuarioDao getUsuarioDao();

    private static AppDatabase sInstance;
}

