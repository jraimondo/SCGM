package com.example.scgm.Interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.scgm.Entidades.Usuario;

import java.util.List;

@Dao
public interface UsuarioDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertarUsuario(Usuario nuevoUsuario);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    void actualizarUsuario(Usuario nuevoUsuario);

    @Delete
    void borrarUsuario(Usuario usuario);

    @Query("SELECT * FROM Usuarios")
    List<Usuario> listarUsuarios();

    @Query("SELECT * FROM Usuarios")
    LiveData<List<Usuario>> listarUsuariosLive();

    @Query("SELECT * FROM Usuarios WHERE Cedula = :cedula AND Passwd = :passwd")
    Usuario login(long cedula, String passwd);


}
