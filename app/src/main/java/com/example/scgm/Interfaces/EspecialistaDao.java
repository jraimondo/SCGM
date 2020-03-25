package com.example.scgm.Interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.scgm.Database.ListaEspecialidades;
import com.example.scgm.Entidades.Especialista;

import java.util.List;

@Dao
public interface EspecialistaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertarEspecialista(Especialista especialistaNuevo);

    @Update
    void updateEspecialista(Especialista especialistaNuevo);

    @Delete
    void borrarEspecialista(Especialista especilista);

    @Query("SELECT * FROM Especialistas WHERE Especialidad = :Especialidad")
    LiveData<List<Especialista>> listarPorEspecialidad(String Especialidad);

    @Query("DELETE FROM Especialistas")
    void borrarTodosLosEspecialistas();


    @Query("SELECT Especialidad, Count(ID) as numeroDeEspecialistas " +
            "FROM Especialistas " +
            "GROUP BY Especialidad " +
            "ORDER BY Especialidad ASC")
    ListaEspecialidades ListarEspecialides();
}
