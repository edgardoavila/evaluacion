package com.example.acs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ListView;

import java.util.List;

public class ListaEstudiantes extends AppCompatActivity {

    ListView Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);
        Lista = findViewById(R.id.lstEstudiantes);

        if(Principal.adaptadorEstudiante!=null){
            Lista.setAdapter(Principal.adaptadorEstudiante);
            Principal.adaptadorEstudiante.notifyDataSetChanged();
        }
    }
}
