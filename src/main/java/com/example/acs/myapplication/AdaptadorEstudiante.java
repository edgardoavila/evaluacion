package com.example.acs.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class AdaptadorEstudiante extends ArrayAdapter <Alumno>{

    public AdaptadorEstudiante(@NonNull Context context, @NonNull List<Alumno> objects) {
        super(context, 0, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Alumno A = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante,parent,false);
        }
        TextView lblNumero = convertView.findViewById(R.id.lblNumero);
        lblNumero.setText((position+1)+"");

        TextView lblNombre = convertView.findViewById(R.id.lblNombre);
        lblNombre.setText(A.nombre);

        TextView lblCodigo = convertView.findViewById(R.id.lblCodigo);
        lblCodigo.setText(A.codigo);

        TextView lblMateria = convertView.findViewById(R.id.lblMateria);
        lblMateria.setText(A.materia + "  " + A.promedio);

        return convertView;
    }

}
