package com.example.acs.myapplication;

public class Alumno {
    String nombre;
    String codigo;
    String materia;
    Double parcial1;
    Double parcial2;
    Double parcial3;
    Double promedio;

    public Alumno(String nombre, String codigo, String materia, Double parcial1, Double parcial2, Double parcial3,Double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
        this.promedio = promedio;
    }
}