package com.example.scgm.Interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.scgm.Database.ConsultaExtendidada;
import com.example.scgm.Database.ListaEspecialidades;
import com.example.scgm.Entidades.Consulta;

import java.util.List;

@Dao
public interface ConsultaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertarConsulta(Consulta nuevaConsulta);

    @Update
    void updateConsulta(Consulta nuevaConsulta);

    @Delete
    void borrarConsulta(Consulta consulta);

    @Query("DELETE FROM Consultas")
    void borrarTodasLasConsultas();

    @Query("SELECT Consultas.ID, Consultas.ID_Usuario, Consultas.Fecha, Consultas.Hora, Consultas.Comentario, " +
            "Especialistas.Nombre AS nombreEspecialista, Especialistas.Especialidad, " +
            "Locales.Nombre AS nombreLocal, Locales.Direccion, Locales.Telefono " +
            "FROM Consultas " +
            "INNER JOIN Especialistas ON (Especialistas.ID = Consultas.ID_Especialista) " +
            "INNER JOIN Locales ON (Locales.ID = Consultas.ID_Local) WHERE ID_Usuario = :ID;"
    )
    List<ConsultaExtendidada> consultasPorUsuario(long ID);

    @Query("SELECT Consultas.ID, Consultas.ID_Usuario, Consultas.Fecha, Consultas.Hora, Consultas.Comentario, " +
            "Especialistas.Nombre AS nombreEspecialista, ESpecialistas.Especialidad, " +
            "Locales.Nombre AS nombreLocal, Locales.Direccion, Locales.Telefono " +
            "FROM Consultas " +
            "INNER JOIN Especialistas ON (Especialistas.ID = Consultas.ID_Especialista) " +
            "INNER JOIN Locales ON (Locales.ID = Consultas.ID_Local) WHERE ID_Usuario = :ID;"
    )
    LiveData<List<ConsultaExtendidada>> consultasPorUsuarioLive(long ID);


}
