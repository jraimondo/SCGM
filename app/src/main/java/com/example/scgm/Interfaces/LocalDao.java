package com.example.scgm.Interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.scgm.Entidades.Local;

import java.util.List;

@Dao
public interface LocalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertarLocal(Local local);

    @Update
    void updateLocal(Local local);

    @Delete
    void borrarLocal(Local local);

    @Query("SELECT * FROM Locales")
    LiveData<List<Local>> listarLocales();

    @Query("DELETE FROM Locales")
    void borrarTodosLosLocales();


}
