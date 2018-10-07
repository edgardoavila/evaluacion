package com.example.acs.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    Button btnNuevo,btnMostrar;
    public static AdaptadorEstudiante adaptadorEstudiante;
    ArrayList<Alumno> lstEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnNuevo = findViewById(R.id.btnNuevo);

        lstEstudiante = new ArrayList<>();
        adaptadorEstudiante = new AdaptadorEstudiante(this,lstEstudiante);

        btnMostrar.setText("Lista Estudiantes "+adaptadorEstudiante.getCount());



        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nuevo = new Intent(Principal.this,Estudiante.class);
                startActivity(nuevo);
            }
        });

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mostar = new Intent(Principal.this,ListaEstudiantes.class);
                startActivity(Mostar);
            }
        });

    }
}
