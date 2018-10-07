package com.example.acs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Estudiante extends AppCompatActivity {
    EditText txtNombre,txtCodigo,txtMateria,txtNota1,txtNota2,txtNota3;
    Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);
        //inicializamos las variables
        txtNombre = findViewById(R.id.txtNombre);
        txtCodigo = findViewById(R.id.txtCodigo);
        txtMateria = findViewById(R.id.txtMateria);
        txtNota1 = findViewById(R.id.txtNota1);
        txtNota2 = findViewById(R.id.txtNota2);
        txtNota3 = findViewById(R.id.txtNota3);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardar();

            }
        });
    }

    private void guardar(){
        String nombre = txtNombre.getText().toString();
        String codigo = txtCodigo.getText().toString();
        String materia = txtMateria.getText().toString();
        Double parcial1 = Double.parseDouble(txtNota1.getText().toString());
        Double parcial2 = Double.parseDouble(txtNota2.getText().toString());
        Double parcoal3 = Double.parseDouble(txtNota3.getText().toString());
        Double promedio = ((parcial1*0.3)+(parcial2*0.3)+(parcoal3*0.4));

        Alumno a = new Alumno(nombre,codigo,materia,parcial1,parcial2,parcoal3,promedio);
        if(Principal.adaptadorEstudiante!=null){
            Principal.adaptadorEstudiante.add(a);
            this.finish();
        }
    }
}
