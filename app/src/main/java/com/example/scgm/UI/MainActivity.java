package com.example.scgm.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.scgm.Database.AppDatabase;
import com.example.scgm.Database.ConsultaExtendidada;
import com.example.scgm.Entidades.Consulta;
import com.example.scgm.Entidades.Especialista;
import com.example.scgm.Entidades.Local;
import com.example.scgm.Entidades.Usuario;
import com.example.scgm.Interfaces.ConsultaDao;
import com.example.scgm.Interfaces.EspecialistaDao;
import com.example.scgm.Interfaces.LocalDao;
import com.example.scgm.Interfaces.UsuarioDao;
import com.example.scgm.R;

import java.util.List;

import kotlin.collections.IntIterator;

import static androidx.room.Room.databaseBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = databaseBuilder(getApplicationContext(),
                AppDatabase.class, "SGCMdb").allowMainThreadQueries().build();

        // Manejar datos de local
        LocalDao LocalDao = db.getLocalDao();
        Local mutualista = new Local("policlinica1", "gral flores", 123456);
        LocalDao.insertarLocal(mutualista);
        // Manejar datos Especialista
        Especialista Cardiologo1 = new Especialista("Juan Perez", "Cardiologo");
        EspecialistaDao EspepecialistaDAO = db.getEspecialistaDao();
        EspepecialistaDAO.insertarEspecialista(Cardiologo1);

        // Manejar datos de usuario
        // Crear usuario
        Usuario usuario1 = new Usuario(1111, "Juan", "Perez", "chau@gmail.com", 520681, "1111", true);
        // Cargar la interfaz de acceso a la tabla
        final UsuarioDao usuarioDao = db.getUsuarioDao();
        // Ingresar a Juan Perez a la tabla usuarios
        usuarioDao.insertarUsuario(usuario1);
        // Traer al usuario Juan Perez desde la tabla Usuarios (con su ID)
        Usuario usuarioLogeado = usuarioDao.login(1111, "1111");
        //  Cambiar el nombre Juan por Pepe
        usuarioLogeado.setNombre("Pepe");
        // Actualizar el usuario Juan Perez a Pepe Perez
        usuarioDao.actualizarUsuario(usuarioLogeado);
        // Manejar datos de Consulta
        // Nota: en este caso si puse las calves foraneas porque sabia que eran 1.
        // en nuestra app el usuario va a elegir el nombre de Local y Especialista y con eso ponemos las claves.
        Consulta consulta1 = new Consulta(1, 1, 1, "12/02/2020", "14:00", "Primera Consulta");
        ConsultaDao ConsultaDao = db.getConsultaDao();
        ConsultaDao.insertarConsulta(consulta1);

        List<ConsultaExtendidada> consultasUsuario1 = ConsultaDao.consultasPorUsuario(1);


        final Button boton_login = findViewById(R.id.login);
        boton_login.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        final EditText cedula = (EditText) findViewById(R.id.usuario);
                        long cedulaActual = Long.parseLong(cedula.getText().toString());
                        final EditText passwd = (EditText) findViewById(R.id.passwd);
                        String passwdActual = passwd.getText().toString();

                        Usuario usuarioActual = usuarioDao.login(cedulaActual, passwdActual);

                        if (usuarioActual != null) {
                            TextView newtext = (TextView) findViewById(R.id.Text01);
                            newtext.setText(
                                    usuarioActual.getNombre()
                            );
                        } else {
                            TextView newtext = (TextView) findViewById(R.id.Text01);
                            newtext.setText(
                                    "Usuario no registrado"
                            );
                        }
                    }
                }
        );

    }
}
